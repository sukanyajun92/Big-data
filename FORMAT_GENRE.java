import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pig.EvalFunc;
import org.apache.pig.backend.executionengine.ExecException;
import org.apache.pig.data.Tuple;

public class FORMAT_GENRE extends EvalFunc <String>
{
    @Override
        public String exec(Tuple input)
        {
            try
            {
                if (input == null || input.size() == 0)
                {
                    return null;
                }

                String str = (String) input.get(0);
                StringBuilder strBuilder = new StringBuilder();
                //if genre = "Children's
                if(str.equals("Children's"))
                {
                    strBuilder.append("Children's <sxs136330>");
                    String newStr=strBuilder.toString();
                    return newStr;
                }
               
                //else if genre="Animation|Children's"
                else if(str.equals("Animation|Children's"))
                {
                    strBuilder.append("Children's & Animation <sxs136330>");
                    String newStr=strBuilder.toString();
                    return newStr;
                }
               
                //else if genre="Children's|Adventure|Animation"
                else if(str.equals("Children's|Adventure|Animation"))
                {
                    strBuilder.append("Children's,Adventure & Animation <sxs136330>");
                    String newStr=strBuilder.toString();
                    return newStr;
                }
                return str;
            }
            catch (ExecException ex)
            {
                System.out.println("Error: " + ex.toString());
            }
            return null;
        }
}