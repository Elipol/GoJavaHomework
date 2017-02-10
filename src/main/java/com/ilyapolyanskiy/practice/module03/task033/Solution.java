package com.ilyapolyanskiy.practice.module03.task033;

/**
 * Created by ignipolari on 10.02.17.
 */
public class Solution {
    public static void main(String[] args) {
        Course cppCource = new Course("Petr Petrovich" , "C++. System programming", 4);
        Course algorithmsCource = new Course("Ivan Ivanovich" , "Algorithms and structures", 3);
        Course frontEndCource = new Course("Ivan Ivanovich" , "FrontEnd development", 2);
        Course MathCource = new Course("Eugeniy Ivanovich" , "Math", 3);
        Course sysAnalysisCource = new Course("Ivan Ivanovich" , "System Analysis", 3);

        Course[] takenCources = {cppCource, algorithmsCource, MathCource};

        Student student0 = new Student("Ivan", "Ivanov", 3);
        Student student1 = new Student( "Ivanov", takenCources);

        CollegeStudent student2 = new CollegeStudent("Petr", "Petrov", 3);
        CollegeStudent student3 = new CollegeStudent("Petr", "Petrov", 3, takenCources, "Harvard", 96, 12334);
        CollegeStudent student4 = new CollegeStudent( "Petrov", takenCources);

        SpecialStudent student5 = new SpecialStudent("Petr", "Petrov", 3);
        SpecialStudent student6 = new SpecialStudent( "Petrov", takenCources);
        SpecialStudent student7 = new SpecialStudent(1233321);
    }
}
