package org.joinmastodon.android.api.requests.timelines;

import com.google.gson.reflect.TypeToken;

import org.joinmastodon.android.api.MastodonAPIRequest;
import org.joinmastodon.android.model.Status;

import java.util.List;

public class GetHomeTimeline extends MastodonAPIRequest<List<Status>>{
	public GetHomeTimeline(String maxID, String minID, int limit){
		super(HttpMethod.GET, "/timelines/home", new TypeToken<>(){});
		if(maxID!=null)
			addQueryParameter("max_id", maxID);
		if(minID!=null)
			addQueryParameter("min_id", minID);
		if(limit>0)
			addQueryParameter("limit", ""+limit);
	}
}
