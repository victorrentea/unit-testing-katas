package victor.testing.kata.diagnostic;

import java.time.LocalDateTime;

public class ClientConfiguration {
		enum AckMode {NORMAL, TIMEBOXED, FLOOD};
		private String sessionId;
		private LocalDateTime sessionStart;
		private AckMode ackMode;
		
		public String getSessionId() {
			return sessionId;
		}
		public void setSessionId(String sessionId) {
			this.sessionId = sessionId;
		}
		public LocalDateTime getSessionStart() {
			return sessionStart;
		}
		public void setSessionStart(LocalDateTime sessionStart) {
			this.sessionStart = sessionStart;
		}
		public AckMode getAckMode() {
			return ackMode;
		}
		public void setAckMode(AckMode ackMode) {
			this.ackMode = ackMode;
		}
		
		
	}