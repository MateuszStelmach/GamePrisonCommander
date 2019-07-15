package pl.com.stelmach.gameprison.person;

public enum CharacterQuality {
    WILL_POWER {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            return qualityStrength;
        }
    },
    INTELLECTUAL_CAPACITY {
        @Override
        public int qualityStrength(Personality personality) {
            return 0;
        }
    },
    EMOTIONAL_SENSITIVITY {
        @Override
        public int qualityStrength(Personality personality) {
            return 0;
        }
    },
    MATERIAL_POSSESSIVENESS {
        @Override
        public int qualityStrength(Personality personality) {
            return 0;
        }
    },
    EGO_STRENGTH {
        @Override
        public int qualityStrength(Personality personality) {
            return 0;
        }
    },
    HEALTH_STRENGTH {
        @Override
        public int qualityStrength(Personality personality) {
            return 0;
        }
    },
    DECEIVING {
        @Override
        public int qualityStrength(Personality personality) {
            return 0;
        }
    },
    SEX_DRIVE_POTENTIAL {
        @Override
        public int qualityStrength(Personality personality) {
            return 0;
        }
    },
    AGGRESSION {
        @Override
        public int qualityStrength(Personality personality) {
            return 0;
        }
    },
    SUBORDINATION {
        @Override
        public int qualityStrength(Personality personality) {
            return 0;
        }
    },
    MENTAL_CONDITION {
        @Override
        public int qualityStrength(Personality personality) {
            return 0;
        }
    },
    ADDICTION_CAPACITY {
        @Override
        public int qualityStrength(Personality personality) {
            return 0;
        }
    },
    LEADERSHIP {
        @Override
        public int qualityStrength(Personality personality) {
            return 0;
        }
    },
    SELF_CENTERED {
        @Override
        public int qualityStrength(Personality personality) {
            return 0;
        }
    },
    WEALTH_CAPACITY {
        @Override
        public int qualityStrength(Personality personality) {
            return 0;
        }
    },
    COMMUNICATION_SKILLS {
        @Override
        public int qualityStrength(Personality personality) {
            return 0;
        }
    },
    FAMILY_BOUND_STRENGTH {
        @Override
        public int qualityStrength(Personality personality) {
            return 0;
        }
    },
    CHILDREN_POSSESSION {
        @Override
        public int qualityStrength(Personality personality) {
            return 0;
        }
    },
    WORK_ABILITY {
        @Override
        public int qualityStrength(Personality personality) {
            return 0;
        }
    },
    MARRIAGE_POTENTIAL {
        @Override
        public int qualityStrength(Personality personality) {
            return 0;
        }
    },
    DRIVE_TO_CRIME {
        @Override
        public int qualityStrength(Personality personality) {
            return 0;
        }
    },
    SOCIAL_STATUS {
        @Override
        public int qualityStrength(Personality personality) {
            return 0;
        }
    },
    EDUCATION_POTENTIAL {
        @Override
        public int qualityStrength(Personality personality) {
            return 0;
        }
    },
    FRIENDS_IN_HIGH_PLACES {
        @Override
        public int qualityStrength(Personality personality) {
            return 0;
        }
    },
    ENEMIES_ATTACKS {
        @Override
        public int qualityStrength(Personality personality) {
            return 0;
        }
    };

    public abstract int qualityStrength(Personality personality);


}
