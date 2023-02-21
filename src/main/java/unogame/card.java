package unogame;

/** This class +++ Insert class description here +++
 *
 * @author Shrey Jani 
 */
public class card {
       public enum Color{
            RED,BLUE,YELLOW,GREEN
        }
	
        public enum Value{
            ZERO,OBE, TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,SKIP
            ,REVERSE,DRAW2,DRAW4,WILDCARD
            
        }
    
        private final Color color;
        private final Value value;
        

        public card(Value value, Color color) {
        this.value = value;
        this.color = color;
    }
        
          /**
     * @return the value
     */
    public Value getValue() {
        return value;
    }
    
    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }


}
