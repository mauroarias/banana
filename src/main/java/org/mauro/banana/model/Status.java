package org.mauro.banana.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public final class Status {
	private final String value;
}
