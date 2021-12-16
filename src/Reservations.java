import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservations {
   private String Name;
   private LocalDate Duration_of_stay;
   private String Type_of_room;
   static float Price;


   public Reservations(String name, LocalDate duration_of_stay, String type_of_room,float price) {
      Name = name;
      this.setDuration_of_stay(Duration_of_stay);
      Type_of_room = type_of_room;
      Price = price;
   }

   public String getName() {
      return Name;
   }

   public void setName(String name) {
      Name = name;
   }

   public LocalDate getDuration_of_stay() {
      return Duration_of_stay;
   }

   public void setDuration_of_stay(LocalDate duration_of_stay) {
      Duration_of_stay = duration_of_stay;
   }

   public String getType_of_room() {
      return Type_of_room;
   }

   public void setType_of_room(String type_of_room) {
      Type_of_room = type_of_room;
   }

   public static float getPrice() {
      return Price;
   }

   public static void setPrice(float price) {
      Price = price;
   }
   public void setDurationOfStay(String Duration_of_stay){
      this.Duration_of_stay = LocalDate.parse(Duration_of_stay, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
   }
   //TO DO
   // If possible calculate the remaining days of the stay

}
