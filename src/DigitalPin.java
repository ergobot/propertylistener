import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class DigitalPin extends Pin{

	public DigitalPin() {
		digitalPin = 0;
	}

//	private PropertyChangeSupport changes = new PropertyChangeSupport(this);
	private int digitalPin;

	public int GetPinValue() {
		return digitalPin;
	}
	public void SetPinValue(int value) {
		int oldValue = digitalPin;
		digitalPin = value;
		// you can do validation on the newValue here
        super.firePropertyChanged("digitalPin", oldValue, digitalPin);
        
		
	}

	
}
