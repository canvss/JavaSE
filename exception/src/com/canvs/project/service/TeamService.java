package com.canvs.project.service;

import com.canvs.project.domain.Architect;
import com.canvs.project.domain.Designer;
import com.canvs.project.domain.Employee;
import com.canvs.project.domain.Programmer;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/26 17:02
 */
public class TeamService {
    private static int counter = 1;
    private final int MAX_MEMBER = 5;
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total;


    public void addMember(Employee e) throws TeamException {
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }
        if (!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        }
        Programmer p = (Programmer) e;
        switch (p.getStatus()) {
            case BUSY:
                throw new TeamException("该员工已是某团队成员");
            case VOCATION:
                throw new TeamException("该员工正在休假，无法添加");
        }
        if (isExist(p)) {
            throw new TeamException("该员工已在本开发团队中");
        }
        int progNum, desNum, arcNum;
        progNum = desNum = arcNum = 0;
        for (int i = 0; i <total; i++) {
            if (team[i] instanceof Architect) {
                arcNum++;
            } else if (team[i] instanceof Designer) {
                desNum++;
            } else {
                progNum++;
            }
        }
        if (p instanceof Architect) {
            if (arcNum >= 1) {
                throw new TeamException("团队中至多只能有一名架构师");
            }
        } else if (p instanceof Designer) {
            if (desNum >= 2) {
                throw new TeamException("团队中至多只能有两名设计师");
            }
        } else {
            if (progNum >= 3) {
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }
        team[total++] = p;
        p.setMemberId(counter++);
        p.setStatus(Status.BUSY);

    }

    public Boolean isExist(Programmer p) {
        for (int i = 0; i < team.length; i++) {
            if (null == team[i]) {
                return false;
            }
            if (team[i].getId() == p.getId()) {
                return true;
            }
        }
        return false;
    }

    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberId() == memberId) {
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        if (i == total) {
            throw new TeamException("找不到指定memberId的员工，删除失败");
        }
        for (int j = i; j < total - 1; j++) {
            team[j] = team[j + 1];
        }
        team[--total] = null;
    }

    public Programmer[] getTeam() {
        Programmer[] programmer = new Programmer[total];
        for (int i = 0; i < total; i++) {
            programmer[i] = team[i];
        }
        return programmer;
    }

}
