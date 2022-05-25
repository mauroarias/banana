package org.mauro.banana.service;

import org.junit.jupiter.api.Test;
import org.mauro.banana.model.Status;
import org.mauro.banana.service.TemplateService;

import static org.assertj.core.api.Assertions.assertThat;

final class TemplateServiceTest {

	private TemplateService service = new TemplateService();

	@Test
	void ping() {
		assertThat(service.ping()).isEqualTo(Status.builder().value("PONG").build());
	}
}
