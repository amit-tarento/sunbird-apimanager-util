package in.ekstep.am.external.learner;

import in.ekstep.am.external.AmResponse;

import java.util.Map;

public interface LearnerApi {

  AmResponse getUserRolesById(String userId, Map<String, String> headers) throws Exception;
}
