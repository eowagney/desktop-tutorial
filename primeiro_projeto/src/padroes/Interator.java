		package estrutura_de_dados;

		import java.util.Scanner;

		public class Interator {
			public static void main(String[] args) {
				

				interface SocialNetwork{
					void Profileiterator createFriendslterator(profield);
					void Profileiterator crateCoworkesiterator(profield);
				}

				static class Facebook implements SocialNetwork{

					@Override
					void Profileiterator createFriendslterator(profield){

					}
					@Override
					void Profileiterator crateCoworkesiterator(profield){
						
					}
				}

				interface Profilelterator{
					void Profile getNext();
					void bool hasMore();
				}

				static class Facebooklterator{
					private Facebook facebook;
					private String type,profield;
					private String currentPosition;
					private Profile[] cache;

					public Facebooklterator(Facebook facebook, String type,profied, String currentPosition, Profile[] cache){
						this.facebook = facebook;
						this. type = type;
						this.currentPosition = currentPosition;
						this.cache = cache;
					}

					public void Facebooklterator(){

					}
					private void lazylnit(){

					}
					public Profile getNext(){

					}
					public boll hasMore(){

					} 

				}

				static class Profile{
					public void getId(){

					}
					public void getEmail(){

					}
				}

				static class SocialSpammer{
					public void send(Interator, message){

					}
				}

				static class Aplication{
					private String spammer;
					private String network;

					public Aplication(String spammer, String network){
						this.spammer = spammer;
						this.network = network;
					}

					public void sendSpamToFriends(profile){


					}
					public void sendSpamToCoworkers(profile)
				}


				
			}
		}
