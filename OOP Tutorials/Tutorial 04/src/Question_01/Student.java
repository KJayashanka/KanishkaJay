package Question_01;

class Student implements Printable {
    private String name;
    private String grades[] = new String[5];
    Student(String name, String grades[]) {
        this.name = name;
        int i = 0;
// copy the first 5 elements of argument to instance field grades
        while (i < 5 && i < grades.length) {
            this.grades[i] = grades[i];
            ++i;
        }
    }
    public void print() {
        System.out.println("name: " + name);
        System.out.print("grades: ");
        for (String s : grades)
            System.out.print(s + " ");
        System.out.println();
    }
}

