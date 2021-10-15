package stack.queue.stack_queue;

public class AnimalShelter {
  private static Queue<Animal> animalQueue= new Queue<>();
  public static Queue<Animal> getAnimalQueue() {
    return animalQueue;
  }
  public static void enqueue(Animal animal) {
    animalQueue.enqueue(animal);
  }
  public static Animal dequeue() {
    Animal animal = null;
    try {
      if(animalQueue.isEmpty()) {
        return null;
      }
      else
      {
        animal = animalQueue.dequeue();
        if(animal.getType() == "Cat" || animal.getType()=="Dog") {
          return animal;
        }
        else {
          return null;
        }
      }
    }catch (Exception e) {
      System.out.println("this is not cat or dog =>" + e.getMessage());
      return null;
    }

  }


  @Override
  public String toString() {
    String S = "AnimalShelter{";
    for (int i = 0; i < animalQueue.getSize(); i++) {
      S = S + animalQueue.dequeue().toString()+ "--";
    }
    return S;
  }
}
