package com.zipcodewilmington.preassessment2;

public enum  AliceBobEnum {


    ALICE("Hey, my name is ALICE!"),

    BOB("Hey, my name is BOB!");

    private String catchPhrase;

    AliceBobEnum(String s) {
        this.catchPhrase=s;
    }

    public boolean isAlice() {
        return this.name().equals("ALICE");
    }

    public boolean isBob() {

         return this.name().equals("BOB");
    }

    public String getCatchPhrase() {
        return catchPhrase;

    }


    public static class AliceBobEvaluator {
        private String input;

        public AliceBobEvaluator(String input) {
            this.input=input;
        }

        public boolean isAlice() {
            if(input.equalsIgnoreCase(AliceBobEnum.ALICE.name()))
            {
                return true;
            }
            else
                return false;
        }

        public boolean isBob() {
            if(input.equalsIgnoreCase(AliceBobEnum.BOB.name()))
            {
                return true;
            }
            else
                return false;
        }
    }
}
