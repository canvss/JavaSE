package com.canvs.grammar.sealed;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/29 21:35
 */
public sealed class Person permits Student,Teacher,Worker{
}
final class Student extends Person{}
sealed class Teacher extends Person{}
non-sealed class Worker extends Person{}
final class MaleTeacher extends Teacher{}
class ConstructionWorker extends Worker{};