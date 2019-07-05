package pl.com.stelmach.gameprison.person;

public enum CharacterQuality {
    WILL_POWER {
        @Override
        public int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance) {
            int qualityStrentgh = 0;

            return qualityStrentgh;
        }
    },
    INTELLECTUAL_CAPACITY {
        @Override
        public int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance) {
            return 0;
        }
    },
    EMOTIONAL_RESPOSIVENESS {
        @Override
        public int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance) {
            return 0;
        }
    },
    MATERIAL_POSSESSIVENESS {
        @Override
        public int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance) {
            return 0;
        }
    },
    EGO_STRENGTH {
        @Override
        public int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance) {
            return 0;
        }
    },
    HEALTH_STRENGTH {
        @Override
        public int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance) {
            return 0;
        }
    },
    DECEIVING {
        @Override
        public int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance) {
            return 0;
        }
    },
    SEX_DRIVE_POTENTIAL {
        @Override
        public int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance) {
            return 0;
        }
    },
    AGGRESSION {
        @Override
        public int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance) {
            return 0;
        }
    },
    SUBORDINATION {
        @Override
        public int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance) {
            return 0;
        }
    },
    MENTAL_CONDITION {
        @Override
        public int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance) {
            return 0;
        }
    },
    ADDICTION_CAPACITY {
        @Override
        public int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance) {
            return 0;
        }
    },
    LEADERSHIP {
        @Override
        public int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance) {
            return 0;
        }
    },
    SELF_CENTERED {
        @Override
        public int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance) {
            return 0;
        }
    },
    WEALTH_CAPACITY {
        @Override
        public int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance) {
            return 0;
        }
    },
    COMMUNICATION_SKILLS {
        @Override
        public int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance) {
            return 0;
        }
    },
    FAMILY_BOUND_STRENGTH {
        @Override
        public int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance) {
            return 0;
        }
    },
    CHILDREN_POSSESSION {
        @Override
        public int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance) {
            return 0;
        }
    },
    WORK_ABILITY {
        @Override
        public int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance) {
            return 0;
        }
    },
    MARRIAGE_POTENTIAL {
        @Override
        public int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance) {
            return 0;
        }
    },
    DRIVE_TO_CRIME {
        @Override
        public int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance) {
            return 0;
        }
    },
    SOCIAL_STATUS {
        @Override
        public int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance) {
            return 0;
        }
    },
    EDUCTAION_POTENTIAL {
        @Override
        public int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance) {
            return 0;
        }
    },
    FRIENDS_IN_HIGH_PLACES {
        @Override
        public int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance) {
            return 0;
        }
    },
    ENEMIES_ATTACKS {
        @Override
        public int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance) {
            return 0;
        }
    };

    public abstract int qualityStrentgh(ElementBalance elementBalance, HeavenCelestialBalance celestialBalance, HouseBalance houseBalance, ZodiacSignBalance signBalance);


}
