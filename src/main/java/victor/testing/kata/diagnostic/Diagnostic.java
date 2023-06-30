package victor.testing.kata.diagnostic;


import java.time.LocalDateTime;

import static java.util.UUID.randomUUID;
import static victor.testing.kata.diagnostic.ClientConfiguration.*;
import static victor.testing.kata.diagnostic.ClientConfiguration.AckMode.*;

public class Diagnostic {
	public static final String DIAGNOSTIC_CHANNEL_CONNECTION_STRING = "*111#";

	private Client client;
	private String diagnosticInfo = "";

	public void setTelemetryClient(Client client) {
		this.client = client;
	}

	public void checkTransmission(boolean force) {
		client.disconnect(force);

		if (! client.getOnlineStatus()) {
			throw new IllegalStateException("Unable to connect.");
		}

		ClientConfiguration config = new ClientConfiguration();
		config.setSessionId(client.getVersion()/*.toUpperCase()*/ + "-" + randomUUID());
		config.setSessionStart(LocalDateTime.now());
		config.setAckMode(NORMAL);
		client.configure(config);

		client.send(Client.DIAGNOSTIC_MESSAGE);
		diagnosticInfo = client.receive();
	}

	public String getDiagnosticInfo() {
		return diagnosticInfo;
	}

}
