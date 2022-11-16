package kr.kwangan2.test;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import kr.kwangan2.domain.Author;
import kr.kwangan2.domain.Blog;
import kr.kwangan2.domain.Comm;
import kr.kwangan2.domain.CommSearcher;


public class BlogTest {
	public static void main(String[] args) {
		String resource = "kr/kwangan2/conf/sqlMapConfig.xml";
		Reader reader;
		SqlSession session = null;
		try {
			reader = Resources.getResourceAsReader(resource);
			SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
			session = sqlMapper.openSession();
			
			//selectBlog
//			List<Blog> blogs = session.selectList("selectBlog");
//			for(Blog blog : blogs) {
//				System.out.println("-------------------------------------------------------------");
//				System.out.println("blog id : " + blog.getBlogId());
//				Author author = blog.getAuthor();
//				System.out.println("\t"+author);
//				List<Comm> comms = blog.getComms();
//				for(Comm comm:comms) {
//					System.out.println("\t"+comm);
//				}
//				System.out.println("-------------------------------------------------------------");
//			}
			
//			//selectCommsByBlogId
//			CommSearcher commSearcher = new CommSearcher();
//			commSearcher.setBlogId(1);
//			commSearcher.setSearchKey("content");
//			commSearcher.setSearchValue("커맨드");
//			List<Comm> comms = session.selectList("selectCommsByBlogId",commSearcher);
//			for(Comm comm:comms) {
//				System.out.println(comm);
//			}

//			//selectCommsByCommIds
//			ArrayList<Integer> commIdlist = new ArrayList<Integer>();
//			commIdlist.add(1);		// blog_id
//			commIdlist.add(1);		// comm_id [1]
//			commIdlist.add(3);		// comm_id [2]
//			commIdlist.add(21);	// comm_id [3]
//			List<Comm> commList = session.selectList("selectCommsByCommIds",commIdlist);
//			for(Comm comm2 : commList) {
//				System.out.println(comm2);
//			}
//			
	
			//insertAuthor
//			Author author = new Author();
//			author.setAuthorName("김나박이");
//			int result_i1 = session.insert("insertAuthor",author);
//			session.commit();
//			if(result_i1>0) {
//				System.out.println(author+"입력 성공!");
//			}
			
//			//insertBlog
//			Blog blog = new Blog();
//			blog.setBlogName("blogname");
//			blog.setBlogTitle("blogTitle");
//			blog.setBlogAuthorId(4);
//			int result_i2 = session.insert("insertBlog",blog);
//			session.commit();
//			if(result_i2>0) {
//				System.out.println(blog+"입력 성공!");
//			}
		
//			//insertComm
//			Comm comm = new Comm();
//			comm.setBlogId(1);
//			comm.setCommContent("commContent");
//			comm.setCommTitle("commTitle");
//			
//			int result_i3 = session.insert("insertComm",comm);
//			session.commit();
//			if(result_i3>0) {
//				System.out.println(comm+"입력 성공!");
//			}
			
			//updateAuthor
//			Author author = new Author();
//			author.setAuthorId(1);
//			author.setAuthorName("감나무");
//			int result1 = session.update("updateAuthor",author);
//			if(result1>0) {
//				System.out.println("Author 업데이트 성공");
//			}
//			session.commit();
			
			//updateBlog
//			Blog blog = new Blog();
//			blog.setBlogTitle("업데이트 블로그 제목");
//			blog.setBlogName("업데이트 블로그 이름");
//			blog.setBlogId(1);
//			blog.setBlogAuthorId(1);
//			int result2 = session.update("updateBlog",blog);
//			if(result2>0) {
//				System.out.println("Blog 업데이트 성공");
//			}
//			session.commit();
			
//			//updateComm
//			Comm comm = new Comm();
//			comm.setCommId(1);
//			comm.setCommTitle("update title");
//			comm.setCommContent("update content");
//			comm.setBlogId(1);
//			int result3 = session.update("updateComm",comm);
//			if(result3>0) {
//				System.out.println("Comm 업데이트 성공");
//			}
			
			//deleteAuthor
//			int result4 = session.delete("deleteAuthor",3);
//			if(result4>0) {
//				System.out.println("Author 삭제 성공");
//			}
//			session.commit();
		
//			//deleteBlog
//			int result5 = session.delete("deleteBlog",2);
//			if(result5>0) {
//				System.out.println("Blog 삭제 성공");
//			}
//			session.commit();
			
//			//deleteComm
//			int result6 = session.delete("deleteComm",1);
//			if(result6>0) {
//				System.out.println("Comm 삭제 성공");
//			}
//			session.commit();
			
			
		} catch(IOException e){
			session.rollback();
			e.printStackTrace();
		}finally {
			if(session!=null) session.close();
		}
	}
}
