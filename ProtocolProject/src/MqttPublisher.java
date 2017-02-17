import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class MqttPublisher {
	public static void main(String args[]) throws MqttException {
		MqttClient client = new MqttClient("tcp://172.24.120.90:1883", MqttClient.generateClientId());
		client.connect();
		MqttMessage msg = new MqttMessage("Hello?".getBytes());
		client.publish("temperature/25/today",msg);
		client.close();
	}
	
}
