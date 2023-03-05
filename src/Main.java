import java.util.Random;

public class Main {
    private static final Random RANDOM= new Random();
    public static void main(String[] args) {

        GryffindorStudent harry = generateGrifffindorStudent ("Гарри Поттер");
        GryffindorStudent germiona =generateGrifffindorStudent("Гермиона Грейнджер");
        GryffindorStudent ron = generateGrifffindorStudent("Рон Уизли");
        SlytherinStudent drako = generateSlytherinStudent("Драко Малфой");
        SlytherinStudent grehem = generateSlytherinStudent("Грехэм Монтегю");
        SlytherinStudent gregori = generateSlytherinStudent("Грегори Гойл ");
        RavenclawStudent chang = generateRavenclawStudent("Чжоу Чанг");
        RavenclawStudent padma = generateRavenclawStudent("Падма Патил");
        RavenclawStudent marcus = generateRavenclawStudent("Маркус Белби");
        HufflepuffStudent zaharia = generateHufflepuffStudent("Захария Смит");
        HufflepuffStudent sedrik = generateHufflepuffStudent("Седрик Диггори");
        HufflepuffStudent jastin = generateHufflepuffStudent("Джастин Финч-Флетчли");
        harry.print();
        germiona.print();
        ron.print();
        drako.print();
        grehem.print();
        gregori.print();
        chang.print();
        padma.print();
        marcus.print();
        zaharia.print();
        sedrik.print();
        jastin.print();
        harry.compareGriffindor(ron);
        harry.compareHogwartrs(drako);
        zaharia.compareHufflepuff(sedrik);
        chang.compareHogwartrs(germiona);

    }
    private static GryffindorStudent generateGrifffindorStudent(String name){
        return new GryffindorStudent( name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100) );
           }
    private static SlytherinStudent generateSlytherinStudent(String name) {
        return new SlytherinStudent( name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));
    }
    private static RavenclawStudent generateRavenclawStudent(String name){
        return new RavenclawStudent(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));
    }
    private static HufflepuffStudent generateHufflepuffStudent(String name){
        return new HufflepuffStudent( name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));
    }
}