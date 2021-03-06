package sh.calaba.instrumentationbackend.actions.button;


import sh.calaba.instrumentationbackend.InstrumentationBackend;
import sh.calaba.instrumentationbackend.Result;
import sh.calaba.instrumentationbackend.actions.Action;


public class ToggleButtonStringChecked implements Action {

    @Override
    public Result execute(String... args) {
    	Result result = new Result(true, "Toggle button checked");
    	
    	boolean isChecked = InstrumentationBackend.solo.isToggleButtonChecked(args[0]);
        
    	if (isChecked) {
    		result.addBonusInformation("Yes");
    		System.out.println("button is selected");
    	} else {
    		result.addBonusInformation("No");
    		System.out.println("button not selected");
    	}
    	
        return result;
    }

    @Override
    public String key() {
        return "toggle_button_string_checked";
    }

}