// Display heading
DISPLAY "Sammy’s Seashore Supplies"

// Prompt user for the number of minutes rented
DISPLAY "Enter the number of minutes rented: "
INPUT minutes

// Calculate hours and remaining minutes
hours = minutes / 60
remaining_minutes = minutes % 60

// Calculate rental cost
rental_cost = (hours * 400) + remaining_minutes

// Display rental details
DISPLAY "Hours: ", hours
DISPLAY "Minutes: ", remaining_minutes
DISPLAY "Total price: R", rental_cost

+-----------------------------+
|     Start                   |
+-----------------------------+
             |
             V
   +----------------------+
   | Display heading      |
   | "Sammy’s Seashore   |
   | Supplies"            |
   +----------------------+
             |
             V
   +----------------------+
   | Prompt user for      |
   | minutes rented       |
   +----------------------+
             |
             V
   +----------------------+
   | Calculate hours and  |
   | remaining minutes    |
   +----------------------+
             |
             V
   +----------------------+
   | Calculate rental cost|
   +----------------------+
             |
             V
   +----------------------+
   | Display rental       |
   | details              |
   +----------------------+
             |
             V
   +----------------------+
   |       End            |
   +----------------------+

