public class Main {
    public static void main(String[] args) {

        System.out.println("ВАСЯ УЧИ ГИТ!!!");
        MainChars we = new MainChars("мы");
        WallOpening wallOpeningFirst = new WallOpening("проём в стене.", SubjectType.ARCHED, 6, 10);
        Action foundWallOpening = new Action(we.getName(), "отыскали", "В результате", wallOpeningFirst.getName());
        System.out.println(foundWallOpening.describe());
        System.out.println(wallOpeningFirst.describe());

        Bridge bridge = new Bridge("Мостик", SubjectType.AIR, 5);
        Action buildConnect = new Action(bridge.getName(), "соединял между собой здания", "прежде.");
        System.out.println(buildConnect.describe());
        System.out.println(bridge.describe());

        WallOpening wallOpeningSecond = new WallOpening("Эти сводчатые проходы");
        Action matching = new Action(wallOpeningSecond.getName(), "соответствовали", LocationPart.TOPFLOOR.getTranslate());
        System.out.println(matching.describe());

        Action saving = new Action(LocationPart.FLOOR.getTranslate(), "сохранился", "к счастью и здесь.");
        System.out.println(saving.describe());

        BigBuilding bigBuilding = new BigBuilding("Это строение", LocationPart.FACADE, LocationPart.TERRACE, SubjectType.AFFORDABLE);
        Action directing = new Action(bigBuilding.getName() + bigBuilding.getSubjectType().getTranslate(), "обращено", "На запад", bigBuilding.getLocationPartFirst().getTranslate());
        System.out.println(directing.describe());
        Action goDown = new Action(bigBuilding.getName(), "спускалось ко льду", bigBuilding.getLocationPartSecond().getTranslate());
        System.out.println(goDown.describe());

        WallOpening wallOpeningThird = new WallOpening("Другой арочный проход");
        Action gape = new Action(wallOpeningThird.getName(), "зиял", "напротив него.");
        System.out.println(gape.describe());

        DeafBuilding deafBuilding = new DeafBuilding("Глухая постройка", SubjectType.CYLINDRICAL, SubjectType.SHABBY, LocationPart.THICKENING, 10);
        Action rise = new Action(deafBuilding.getName() + deafBuilding.getSubjectTypeFirst().getTranslate() + deafBuilding.getSubjectTypeSecond().getTranslate(), "возвышалась", "с венчающим её округлым утолщением.");
        System.out.println(rise.describe());
        System.out.println(deafBuilding.describe());

        Action entrance = new Action(we.getName(), "собираемся войти в первый дом,", "груда обломков поможет нам это сделать.");
        Action doubt = new Action(we.getName(), "подверглись сомнению", "на какое-то время.");
        Action waitCase = new Action(we.getName(), "ждали", "удобного случая и мечтали о нём.");
        System.out.println(waitCase.describe());
        System.out.println(doubt.describe());
        System.out.println(entrance.describe());

        Action notAfraid = new Action(we.getName(), "не побоялись влиться", "в эту стародавнюю мистерию, это правда.");
        System.out.println(notAfraid.describe());
        SurvivingBuilding survivingBuilding = new SurvivingBuilding("уцелевшее здание", SubjectType.ANCIENT);
        Action finallyComeIn = new Action("нам", "предстояло вновь собраться с духом и войти в", "Природа постепенно открывалась нам во всей своей чудовищной неповторимости,", survivingBuilding.getName() + survivingBuilding.getSubjectType().getTranslate());
        System.out.println(finallyComeIn.describe());

        WallOpening wallOpeningFourth = new WallOpening("провал в стене.");
        Lobby lobby = new Lobby("вестибюль", LocationPart.BASRELIEFPORTAITRS, LocationPart.PAVEDFLOOR);
        Action climb = new Action(we.getName(), "заставили себя вскарабкаться" + LocationPart.ICYSTONES.getTranslate(), "В конце концов", "к " + wallOpeningFourth.getName());
        System.out.println(climb.describe());

        Action jumpOff = new Action(we.getName(), "спрыгнули на", "Сразу после этого", lobby.getLocationPartSecond().getTranslate());
        System.out.println(jumpOff.describe());

        Action locate = new Action(lobby.getName(), "находился", "Здесь, как мы ещё раньше разглядели", lobby.getLocationPartFirst().getTranslate());
        System.out.println(locate.describe());

    }
}
