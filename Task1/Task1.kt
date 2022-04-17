/*Create different arrays of trains with their Name, Source, Destination and DepartureTime,
For example: Rajdhani, Surat, Delhi, 10:30 AM. 
Now write a program that can filter train details by entering input in command-line arguments from its 
Name, Source, Destination, DepartureTime.*/

//Array of Trains with its details
fun arrayOfTrains(): List<Map<String, String>> {
    val trainListMaps = listOf(
    mapOf("Name" to "Rajdhani", "Source" to "Mumbai", "Destination" to "Delhi", "DepartureTime" to "6:42 AM"),
    mapOf("Name" to "FlyingRani", "Source" to "Bhopal", "Destination" to "Rajasthan", "DepartureTime" to "1:40 AM"),
    mapOf("Name" to "Express", "Source" to "Goa", "Destination" to "Karnataka", "DepartureTime" to "7:48 PM")
    )
    return trainListMaps;
}

//Main function
fun main(args: Array<String>) {
    if(args.size==2){
      	val listOfTrains = arrayOfTrains();
    	  for(items in listOfTrains){
            for((key,value) in items) {
                if( key == args[0]
            && value == args[1]){
                    println(items)
                } else {
                    print("No details found!")
                }
            }
    	} 
    } else {
        print("Please provide program arguments.")
    }
}