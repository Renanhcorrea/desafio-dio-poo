package com.dio.desafio;

import java.time.LocalDate;

import main.java.com.dio.desafio.dominio.Bootcamp;
import main.java.com.dio.desafio.dominio.Curse;
import main.java.com.dio.desafio.dominio.Dev;
import main.java.com.dio.desafio.dominio.Mentorship;

public class Main {
    public static void main(String[] args) {
        Curse courseOne = new Curse();
        courseOne.setTitle("Java Course");
        courseOne.setDescription("Java course description\"");
        courseOne.setWorkLoad(8);

        Curse courseTwo = new Curse();
        courseTwo.setTitle("JavaScript Course");
        courseTwo.setDescription("JavaScript course description");
        courseTwo.setWorkLoad(4);

        Mentorship mentorship = new Mentorship();
        mentorship.setTitle("Java Mentorship");
        mentorship.setDescription("Java mentorship description");
        mentorship.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Java Developer Bootcamp");
        bootcamp.setDescription("Java Developer Bootcamp description");
        bootcamp.getConteudos().add(courseOne);
        bootcamp.getConteudos().add(mentorship);

        Dev devRenan = new Dev();
        devRenan.setName("Renan");
        devRenan.InscreverBootcamp(bootcamp);
        System.out.println("Enrolled Content: " + devRenan.getenrolledContent());
        System.out.println(" - ");
        devRenan.progredir();
        devRenan.progredir();
        System.out.println("Completed Content: " +devRenan.getcompletedContent());
        System.out.println("XP: " + devRenan.calcularTotalXp());
        
        System.out.println("\n ------------ \n");
        
        Dev devDaiane = new Dev();
        devDaiane.setName("Camila");
        devDaiane.InscreverBootcamp(bootcamp);
        System.out.println("Enrolled Content: " +devDaiane.getenrolledContent());
        System.out.println(" - ");
        devDaiane.progredir();
        System.out.println("Completed Content: " +devDaiane.getcompletedContent());
        System.out.println("XP: " + devDaiane.calcularTotalXp());

    }
}