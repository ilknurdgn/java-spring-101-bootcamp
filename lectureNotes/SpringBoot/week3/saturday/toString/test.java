package springboot.com.techcareer.week3.saturday.toString;

public class test {

    public static void main(String[] args) {

        Flower flower = new Flower();
        flower.setName("Rose");
        flower.setNumber("1");
        System.out.println(flower);

        // toString metodu ezilmezse Object classındaki toString metodu çalışır. Aşağıdaki çıktıyı verir.
        // springboot.com.techcareer.week3.saturday.toString.Flower@8fa9e5f


        // toString metodu ezildiğinde aşağıdaki çıktıyı verir.
        // Flower{number='1', name='Rose'}
    }
}
