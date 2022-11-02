public class Question_02 {
    public static void main(String[] args) {
        String animal1 = "quick brown fox";
        String animal2 = "lazy dog.";
        String article = "The";
        String action = "jumps over";

        String sentence1 = article.concat(" ").concat(animal1).concat(" ").concat(action).concat(" ").concat(article)
                .concat(" ").concat(animal2);
        System.out.println(sentence1);

        //Question 02 PART II
        String sentence2 = article + " " + animal1 + " " + action + " " + article + " " + animal2;
        System.out.println(sentence2);
    }
}
