package hello;



public class Greeter {



  private String name = "World";



  public String getName() 

  {

    return name;

  }



  public void setName(String name) 

  {

      this.name = name;

  }



  public String sayHello() 

  {

  	if (name == "World") 

    {

       return "Hello!";

    }

    else 

    {

       return "Hello " + name + "!";

    }

  }

}
