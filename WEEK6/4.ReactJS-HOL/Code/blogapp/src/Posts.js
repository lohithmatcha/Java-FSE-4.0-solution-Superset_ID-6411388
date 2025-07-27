import React,{Component} from "react";
import Post from "./Post";

class Posts extends React.Component {
    constructor(props){
        super(props);
        this.state={
            posts:[],
            hasError:false
        }
    }

    loadPosts = async () =>{
        try{
            const response = await fetch('https://jsonplaceholder.typicode.com/posts');
            const data =await response.json();
            const ToPost=data.map(p=>new Post(p.id,p.titl,p.body));
            this.setState({posts: ToPost}); //posts attached from fetched data
        }
        catch(error){
            this.setState({hasError:true});
            alert('Error while loading posts!!');
        }
    };

    componentDidMount(){
        this.loadPosts();
    }



    render(){
        const {posts}=this.state;
        return(
            <div>
                <h1>Blog Posts</h1>
                {posts.map(post =>(
                    <div key={post.id}>
                         <h3>{post.titl}</h3>
                         <p>{post.body}</p>
                    </div>
                ))}
            </div>
        )
    }

     componentDidCatch(error,info){
        this.setState({hasError:true});
        alert('Something went wrong!');
    }
}

export default Posts;