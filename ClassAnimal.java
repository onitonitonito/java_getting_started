public class ClassAnimal {
String name;                            // set Global
String kind;

public void setName(String kind, String name) {
        // method setName('bob') .. if call set Class name = name
        this.kind = kind;
        this.name = name;
}

public String getVoiceOfAnimal()  {
        if (this.kind == "dog") {
                return "Bark! BarK!,.. I'm a Dog!";
        }
        else if (this.kind == "cat") {
                return "Meow Meow! I'm a Cat!";
        }
        else {
                return " '....' I'm just simply the Animal.";
        }
}

public static void main(String[] args)  {
        ClassAnimal cat = new ClassAnimal();
        ClassAnimal dog = new ClassAnimal();
        ClassAnimal owl = new ClassAnimal();

        cat.setName("cat", "Garfield");                   // call method
        System.out.println("ClassAnimal instance(" +cat.kind+ ") Name= " +cat.name);
        System.out.println(cat.getVoiceOfAnimal()+ "\n");

        dog.setName("dog", "Scooby-doo");
        System.out.println("ClassAnimal Instance(" +dog.kind+ ") Name= " +dog.name);
        System.out.println(dog.getVoiceOfAnimal()+ "\n");

        owl.setName("owl", "All-nighter");
        System.out.println("ClassAnimal Instance(" +owl.kind+ ") Name= " +owl.name);
        System.out.println(owl.getVoiceOfAnimal()+ "\n");
}
}
