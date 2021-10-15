package stack.queue.stack_queue;

public class StackQueueBrackets {
  public static boolean stackQueueBrackets(String s){
    String[] dataArr = s.split("");
    Stack<String> stack= new Stack();
    Queue<String> queue = new Queue();
    int count1 = 0;
    int coun2 = 0;
    boolean result = true;
    for(int i=0 ; i< dataArr.length ; i++)
    {
      if ((dataArr[i].equals("{")) ||( dataArr[i].equals("[")  || dataArr[i].equals("(") ))
      {
        count1++;

        stack.push(dataArr[i]);
      }
      if((dataArr[i].equals("}")) ||( dataArr[i].equals("]")  || dataArr[i].equals(")") ))
      {
        coun2++;
        stack.push(dataArr[i]);
      }
    }
    if(coun2 != count1 || (coun2 == 0 && count1 == 0))
    {
      result = false;
    } else{
      while (!stack.isEmpty()){
        queue.enqueue(stack.pop());
        if((queue.peek().equals("]")  && (stack.peek().equals("(")  || stack.peek().equals("{") )) ||
          (queue.peek().equals(")")  && (stack.peek().equals("[")  || stack.peek().equals("{") ))||
          (queue.peek().equals("}")  && (stack.peek().equals("(")  || stack.peek().equals("[") ))){
          result = false;
        }else {
          queue.dequeue();
        }
      }

    }
    return  result;
  }
}
