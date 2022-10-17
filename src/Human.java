public class Human {
    String name;
    int date;
    String city;
    String post;

    Human(String name, int date, String city, String post) {
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (date == 0) {
            System.out.println("Информация не указана");
        } else {
            this.date = date;
        }
        if (city == null) {
            this.city = "Информация не указана";
        } else {
            this.city = city;
        }
        if (post == null) {
            this.post = "Информация не указана";
        } else {
            this.post = post;
        }

        }
    String getName() {
            return name;
    }
    int getDate() {
        if (date < 0) {
            return Math.abs(date);
        } else {
            return date;
        }
    }

    String getCity() {
            return city;
    }
    String getPost() {
        return post;
    }

    void printHuman() {
            System.out.println("Привет! Меня зовут " + getName() + ", Я из города  " + getCity() + ", я родился в " + getDate() + " году. Я работаю на должности " + getPost() +". Будем знакомы!");
    }
}
