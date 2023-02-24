package vttp2022.csf.assessment.server.repositories;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vttp2022.csf.assessment.server.models.Comment;
import vttp2022.csf.assessment.server.models.Restaurant;

@Repository
public class RestaurantRepository {

	@Autowired
	private JdbcTemplate template;

	// TODO Task 2
	// Use this method to retrive a list of cuisines from the restaurant collection
	// You can add any parameters (if any) and the return type
	// DO NOT CHNAGE THE METHOD'S NAME
	// Write the Mongo native query above for this method
	// db.restaurant.find
	public List<Restaurant> getCuisines() {
		List<Restaurant> list = new LinkedList<>();

		while (rs.next()) {
		FileData file = new FileData();
		file.setCuisine(rs.getString("cuisine"));

		for (String word: rs.split(“/”)) {
			String w = word.trim();
			if (w.contains(“-”))
				notMatch.add(w.substring(1));
			else
				matches.add(w); 
		}
		list.add(file);
		}
		return list;
	}

	// TODO Task 3
	// Use this method to retrive a all restaurants for a particular cuisine
	// You can add any parameters (if any) and the return type
	// DO NOT CHNAGE THE METHOD'S NAME
	// Write the Mongo native query above for this method
	// db.restaurant.find().sort({"title":-1})
	public String getRestaurantsByCuisine(String cuisine) {
		// Implmementation in here
		ValueOperations<String, String> valueOp = redisTemplate.opsForValue();
        String value = valueOp.get(Integer.toString(cuisine));
        return value;

	}

	// TODO Task 4
	// Use this method to find a specific restaurant
	// You can add any parameters (if any)
	// DO NOT CHNAGE THE METHOD'S NAME OR THE RETURN TYPE
	// Write the Mongo native query above for this method
	// Db.restaurant.find({"restaurantId":"xxxx"})
	public Optional<Restaurant> getRestaurant(???) {
		// Implmementation in here
		
	}

	// TODO Task 5
	// Use this method to insert a comment into the restaurant database
	// DO NOT CHNAGE THE METHOD'S NAME OR THE RETURN TYPE
	// Write the Mongo native query above for this method
	//
	public void addComment(Comment comment) {
		// Implmementation in here

	}

	// You may add other methods to this class

}
