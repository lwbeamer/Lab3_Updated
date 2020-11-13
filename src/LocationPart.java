public enum LocationPart {
    ICECOVER("ледяным покровом."),
    TOPFLOOR("верхним этажам."),
    FLOOR("Пол"),
    FACADE("фасадом."),
    TERRACE("терассами."),
    THICKENING("округлым утолщением"),
    PAVEDFLOOR("выложенный сланцами пол."),
    BASRELIEFPORTAITRS("с барельефными портретами."),
    ICYSTONES(" по обледенелым камням");

    private final String TRANSLATE;

    LocationPart(String translate) {
        this.TRANSLATE = translate;
    }

    public String getTranslate() {
        return TRANSLATE;
    }

    @Override
    public String toString() {
        return "LocationPart{" +
                "translate='" + TRANSLATE + '\'' +
                '}';
    }
}
