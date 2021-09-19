1, 5, 8, 20, 23, 26, 29, 34, 37, 39, 41, 42, 43, 47, 54, 55, 59, 62, 65, 70

<!DOCTYPE html>
<html>
  <body>	
	
	<div class="rate">

        <button onclick="test()">Click</button>
    
  </div>
	
	
	
  </body>
</html>
<script>

    function test(){
        


        for (let a = 0; a < array.length; a++) {
            for (let b = a+1; b < array.length; b++) {
                for (let c = b+1; c < array.length; c++) {
                    for (let d = c+1; d < array.length; d++) {
                        for (let e = d+1; e < array.length; e++) {
                            if((array[a]+array[b]+array[c]+array[d]+array[e]) === 178)
                            console.log(array[a], array[b], array[c], array[d], array[e] )
                            
                        }
                        
                    }
                    
                }
                
            }            
        }
        console.log("test");
    }
</script>
