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

	// db.restaurants.find	
	public List<Restaurant> getCuisines() {
		List<Restaurant> list = new LinkedList<>();

		// final SqlRowSet rs = template.queryForRowSet(“select * from tv_shows limit ? offset ?”, limit, offset);
		// while (rs.next()) {
		// 	TVShow tv = new TVShow();
		// 	tv.setProgramId(rs.getInt(“prog_id”);
		// 	tv.setName(rs.getString(“name”));
		// 	result.add(tv);
		// 	}
		// 	return (Collections.unmodifiableList(result)); -->

// b) convert / to _
		// for (String word: listOfWords.split(“,”)) {
		// 	String w = word.trim();
		// 	if (w.startsWith(“-”))
		// 	notMatch.add(w.substring(1));
		// 	else
		// 	matches.add(w); -->

		
// 		List<FileData> opt = template.query(“select * from files where name like ?”,
// params, (rs: ResultSet) -> {
// List<FileData> list = new LinkedList<>();
// while (rs.next()) {
// FileData file = new FileData();
// file.setName(rs.getString(“name”));
// file.setContentType(rs.getString(“media_type”));
// file.setContent(rs.getBytes(“content”));
// list.add(file);
// }
// return list;
// },


	}

	// TODO Task 3
	// Use this method to retrive a all restaurants for a particular cuisine
	// You can add any parameters (if any) and the return type
	// DO NOT CHNAGE THE METHOD'S NAME
	// Write the Mongo native query above for this method
	//
	public ??? getRestaurantsByCuisine(???) {
		// Implmementation in here

	}

	// TODO Task 4
	// Use this method to find a specific restaurant
	// You can add any parameters (if any)
	// DO NOT CHNAGE THE METHOD'S NAME OR THE RETURN TYPE
	// Write the Mongo native query above for this method
	//
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
