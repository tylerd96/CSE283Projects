import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class MqttSubscriber implements MqttCallback{

public MqttSubscriber() {
		// TODO Auto-generated constructor stub
	
	}

public void runProgram() throws MqttException{
	MqttClient subClient = new MqttClient("tcp://172.24.120.90:1883", MqttClient.generateClientId());
	subClient.connect();
	subClient.setCallback(this);
	subClient.subscribe("temperature/#");
	//subClient.
}

public static void main(String[] args) throws MqttException{
	new MqttSubscriber().runProgram();
	}

public void messageArrived(String top, MqttMessage msg){
	System.out.println("The received message is: "+msg+" and the topic is: "+top);
}

@Override
public void connectionLost(Throwable arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void deliveryComplete(IMqttDeliveryToken arg0) {
	// TODO Auto-generated method stub
	
}
}
