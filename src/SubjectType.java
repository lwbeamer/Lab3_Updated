public enum SubjectType {
    ARCHED("арочный"),
    CYLINDRICAL(" цилиндрической формы"),
    AIR("Воздушный"),
    AFFORDABLE(" доступное для нас"),
    SHABBY(" обшарпанная"),
    ANCIENT(" баснословно древней эпохи.");

    private final String TRANSLATE;

    SubjectType(String translate) {
        this.TRANSLATE = translate;
    }

    public String getTranslate() {
        return TRANSLATE;
    }

    @Override
    public String toString() {
        return "SubjectType{" +
                "translate='" + TRANSLATE + '\'' +
                '}';
    }
}
