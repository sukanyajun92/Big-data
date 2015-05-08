import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.io.Text;

public class HiveUDF extends UDF 
{
    public Text evaluate(Text s) 
    {
        if (s != null) 
        {
            try 
            {
            	if(s.toString().equalsIgnoreCase("Animation|Children's"))
            	{
            		String str;
            		str="Animation, & Children's - <sxs136330>";
            		Text to_value = new Text("");
            		to_value.set(str);
            		return to_value;
            	}
            	
            	else if(s.toString().equalsIgnoreCase("Adventure|Animation|Children's"))
            	{
            		String str;
            		str="Adventure, Animation, & Children's - <sxs136330>";
            		Text to_value = new Text("");
            		to_value.set(str);
            		return to_value;
            	}
            } 
            catch (Exception e) 
            { // Should never happen
        		Text to_value = new Text("");
                to_value = new Text(s);
            }
        }
        return s;
    }
}
