package com.rocketseat.planner.trip;

import java.util.List;

public record TripRequestPayload(String destination, String start_at, String end_start_at, List<String> emails_to_invites, String owner_email, String owner_name) {

}
