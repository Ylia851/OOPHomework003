public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name, int age, int wright, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;

        @Override
        public String toString() {
            return "Person {" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", weight=" + weight +
                    ", height=" + height +
                    '}';
        }

        @Override
        public int compareTo (Person o) {
            //return this.name.compareTo (o.name);
            if(this.name.compareTo(o.name) == 0){
                if(o.age.compareTo(this.age) == 0){
                    if(this.height >  o.height) return 1;
                    else if(this.height == o.height) return 0;
                    else return -1;
                }
            }

        }

        public static void main (String[] args){
            ArrayList<Person> peoples = new ArrayList<> ();
            peoples.add (new Person ("Дарья", 16, 52, 165));
            peoples.add (new Person ("Мария", 24, 56, 158));
            peoples.add (new Person ("Анна", 23, 61, 173));
            peoples.add (new Person ("Виктор", 34, 89, 190));
            peoples.add (new Person ("Дарья", 55, 73, 180));
            peoples.add (new Person ("Максим", 18, 100, 175));
            peoples.add (new Person ("Александр", 23, 79, 168));
            peoples.add (new Person ("Александр", 37, 93, 187));
            Collections.sort(peoples);
            System.out.println(peoples);
        }


    }

}
