/*5) on the developer side 
create checked exception "ResourceNotAllocatedException"

create a class:

public class MyResource implements AutoCloseable
{
	public MyResource(int capacity) throws ResourceNotAllocatedException
	{
		if(capacity>100)
		{
			throw new ResourceNotAllocatedException("not sufficient space");
		}
	}
    void disp()
    {
    	System.out.println("successful");
    }
	@Override
	public void close()  {
		System.out.println("resource is closed");
		
	}
}