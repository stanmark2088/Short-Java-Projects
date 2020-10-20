package com.company.employee;

import java.util.Date;

public class Mentor extends Employee{

    private Module module;
    private KnownLanguages knownLanguages;

    public Mentor(String name, Date birthday, String phoneNumber) {
        super(name, birthday, phoneNumber);
    }


    public void assignToModule(Module module){
        if(canBeAssignedToModule(module)){
            this.module = module;
        }
    }

    public boolean canBeAssignedToModule(Module module){
        if(module.knownLanguages.equals(this.module)){
            return true;
        }
        return false;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public KnownLanguages getKnownLanguages() {
        return knownLanguages;
    }

    public void setKnownLanguages(KnownLanguages knownLanguages) {
        this.knownLanguages = knownLanguages;
    }

    public enum Module{
        PROBASICS(KnownLanguages.PYTHON),
        WEB(KnownLanguages.JAVASCRIPT),
        OOP(KnownLanguages.JAVA),
        ADVANCED(KnownLanguages.CSHARP);

        private final KnownLanguages knownLanguages;


        Module(KnownLanguages knownLanguages) {
            this.knownLanguages = knownLanguages;
        }

        public KnownLanguages getKnownLanguages() {
            return knownLanguages;
        }

        public Module next(){
            return switch(this){
                case PROBASICS -> WEB;
                case WEB -> OOP;
                case OOP -> ADVANCED;
                default -> PROBASICS;
            };
        }
    }

    public enum KnownLanguages{
        PYTHON,
        JAVASCRIPT,
        JAVA,
        CSHARP
    }
}


