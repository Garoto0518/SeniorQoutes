package com.garoto.quotessenior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    Button b1;
    Button b2;
    // hold quotes for the app, quotes added here!
    private String quotes[] = {"\"Learn the rules like a pro, so you can break them like an artist\"" + "\n\n\t Pablo Picasso.",
            "\"If I'm no back in five minutes, just wait longer.\"" + "\n\n\t Ace Ventura.",
            "\" The limit does not exist\"" + "\n\n\t Mean Girls.", "\" Life is tough but it's tougher when you're stupid.\"" + "\n\n\t John Wayne.",
            "\"You're ALL gonna regret not dating me in high school.\"" + "\n\n\t Jocelyn Madero.",
            "\"#Your name, was released from his 4 year sentence.\"" + "\n\n\t Faizon Graham.",
            "\"If idiots could fly, this place would be an airport.\"" + "\n\n\t Ethan Smith.",
            "\"How can mirrors be real if our eyes aren't real.\"" + "\n\n\t Jaden Smith.",
            "\"If opportunity doesn't knock, build a door.\"" + "\n\n\t Milton Berle",
            "\"Every champion was once a contender that refused to give up.\"" + "\n\n\t Rocky Balboa",
            "\"Try to be a rainbow in someone's cloud.\"" + "\n\n\t Maya Angelou",
            "\"Life is too short to be living somebody else's dream/\"" + "\n\n\t Hugh Hefner",
            "\"Better to ask twice than to lose your way once.\"" + "\n\n\t Danish Proverb",
            "\"It's been real, it's been fun, but i wouldn't say it's been real fun.\" " + "\n\n\t u/HooksFourHands",
            "\"It's the friends you can call up at 4 a.m. that matter.\"" + "\n\n\t Marlene Dietrich",
            "\"Never say sorry for being honest.\"" + "\n\n\t Unknown", "I'm actually not funny, I'm just really mean and people think I'm joking.\"" + "\n\n\t Alixandra Garcia",
            "\"This wasn't like High School Musical at all.\"" + "\n\n\t Seth Egan", "\"I'm so much cooler online.\"" + "\n\n\t Emily Elkins",
            "\"I had to put my grades up for adoption because i could,t raise them.\"" + "\n\n\t Irfan Imthias",
            "\"You can't open the story of my life and just flip to page 738 and think you know me.\"" + "\n\n\t Arin Hanson",
            "\"Love fades away. But things are forever.\"" + "\n\n\t Tom Haverford", "\"Becoming an adult is probably the dumbest thing you could do!\"" + "\n\n\t Jackson Harris",
            "\"Senior year was tough, but i got through it wih the help of Little Caesar's HOT-N-READY $5 lunch combo!nA four slice DEEP!DEEP! Dish pepperoni pizza and a 20oz drink, just the boost i need to get me through the day!\"" + "\n\n\t Zachary",
            "\"No matter what, you keep finding something to fight for.\"" + "\n\n\t The Last of Us",
            "\"I'm going to be the next Hokage.\"" + "\n\n\t Naruto", "\"My dog ate my senior quote\"" + "\n\n\t Unknown", "\"That's what she said!\"" + "\n\n\t Mike Myers",
            "\"Waking up is the second hardest thing in the morning.\"" + "\n\n\t  Conner Hart",
            "\"Courage is the mastery of fear, not the absence of it.\"" + "\n\n\t Ray Palmer", "\"Courage is resistance to fear, mastery to fear, not absence of fear.\"" + "\n\n\t Mark Twain",
            "\"Our lives are before us. Our paths are behind us. But our memories are forever with us.\"" + "\n\n\t Jennifer Holmes", "\"No\"" + "\n\n\t Rosa Parks",
            "\"If somebody ever asks you to do something, do it really bad so you never have to do it again\"" + "\n\n\t Paris Hilton",
            "\"A girl doesn't need anyone who doesn't need her\"" + "\n\n\t Marilyn Monroe", "\"The two most important days in your life are the day you are born and the day you find out why.\"" + "\n\n\t Mark Twain",
            "\"My computer screen is brighter than my future.\"" + "\n\n\t Katia Perez", "\"Make sure your worst enemy doesn't live between your ears\"" + "\n\n\t Laird Hamilton",
            "\"Disregard females, acquire currency\"" + "\n\n\t Unknown", "\"All those moments will be lost in time, like tears in rain\"" + "\n\n\t Roy Beatty's", "\"I remember when a quarter used to cost a nickel\"" + "\n\n\t Old Man Jenkins",
            "\"If life seems dangerous and unmanageable, just remember that it is, and you can't survive forever\"" + "\n\n\t Welcome to NightVale", "\"Once again I stand atop the broken bodies of my enemies, Victorious but not unscarred.\"" + "\n\n\t Starcraft",
            "\"Those who can make you believe absurdities can make you commit atrocities\"" + "\n\n\t Voltaire", "\"Life is life riding a bicycle. To keep yor balance you must keep moving.\"" + "\n\n\t Albert Einstein",
            "\"Our greatest glory is not in never falling, but in rising every time we fall.\"" + "\n\n\t Confucius", "\"A journey of a thousand miles must begin with a single step. \"" + "\n\n\t Lao Tzu",
            "\"...our existence is but a brief crack of light between two eternities of darkness\"" + "\n\n\t Vladimir Nabokov", "\"Shoud have burned this place down when I had the chance. \n or \n \"The Office, season 7, episode 19, minute 14:45\"" + "\n\n\t The Office",
            "\"Goodbye everyone, I'll remember you all in therapy\"" + "\n\n\t Plankton", "\"Of course I dress well. I didn't spend all that time in the closet for nothing\"" + "\n\n\t Maxwell Barrett",
            "\"When I die, I want the people I did group projects with to lower me into the ground so they can let me down one last time\"" + "\n\n\t Jenna Allen",
            "\"I want to thank Google, Mathway, Quizlet, Slander, Symbolab, and to whoever invented copy and paste.\"" + "\n\n\t Abdul Leiba", "\"I started high school with straight A's now I'm not even straight.\"" + "\n\n\t Amberlyn Murray",
            "\"Cheaters never win, but i just graduated.\"" + "\n\n\t Richard Ailot", "\"Education is important, but big biceps are importanter.\"" + "\n\n\t Hugh Vo", "\"I'm gonna go stand outside. If anyone asks, I'm outstanding.\"" + "\n\n\t Taylor Bass",
            "\"Love Sucks \"" + "\n\n\t Naomi Clark", "\"\"I guess the only time people think about injustice is when it happens to them.\"" + "\n\n\t Charles Bukowski", "\" The chief danger in life is that you may take too many precautions.\"" + "\n\n\t Alfred Adler",
            "\"I find out what the world needs. Then, I go ahead and and invent it\"" + "\n\n\t Thomas Edison", "\"Anything that gets your blood racing is probably worth doing. \"" + "\n\n\t Hunter S. Thompson", "\"Our greatest weakness lies in giving up. The most certain way to succeed is always to try just one more time.\"" + "\n\n\t Thomas Edison",
            "\"I would rather walk with a friend in the dark, than alone in the light\"" + "\n\n\t Hellen Keller", "\"Sometimes you just have to pee in the sink\"" + "\n\n\t Charles Bukowski", "\"Create a life that you truly believe will make you happy. \"" + "\n\n\t Steven Redhead", "\"Without music, life would be a mistake\"" + "\n\n\t Friedrich Nietzsche",
            "\"You can't start the next chapter of your life keep re-reading your last one.\"" + "\n\n\t Pravinee Hurbungs", "\"One book, one pen, one child, and one teacher can change the world.\"" + "\n\n\t Malala Yousafzai", "\"Magic is easy if you put your heart into it\"" + "\n\n\t Michael Jackson", "\"What you seek is seeking you \"" + "\n\n\t Rumi",
            "\"No matter how you feel today \n Get up, dress up and show up.\"" + "\n\n\t Martha Graham", "\"No artist is ahead of his time. \n He is time.\"" + "\n\n\t Martha Graham", "\"Love and loss share the same unmade bed.\"" + "\n\n\t Michale Faudet", "\"The desire not to be anything is the desire not to be.\"" + "\n\n\t Ayn Rand", "\"Charity begins home. Revenge begins next door.\"" + "\n\n\t Charles Dickens",
            "\"Life seems to be a quick succession of busy nothings.\"" + "\n\n\t Jane Austen", "\"Lovers don't meet somewhere. They are in each other all along.\"" + "\n\n\t Rumi", "\"We lie best when we lie to ourselves\"" + "\n\n\t Stephen King", "\"In the temple of his spirit, each man is alone.\"" + "\n\n\t Ayn Rand", "\"Love kills suddenly leaving no evidence\"" + "\n\n\t Paulo Coelho",
            "\"Lost is a lovely place to find yourself.\"" + "\n\n\t Michael Faudet", "\"You are not a drop in the ocean. \n You are the entire ocean in a drop.\"" + "\n\n\t Rumi", "\" Control or be controlled is the choice that will make life different.\"" + "\n\n\t Steven Readhead", "\" Entrepreneurship is neither a science nor an art. It is a practice.\"" + "\n\n\t Peter Ducker",
            "\"Imagine if i was quoted\"" + "\n\n\t Anonymous", "\"It doesn't stop being magic just because you know how it works.\"" + "\n\n\t Terry Pratchett", "\"The world cannot be ruled from below.\"" + "\n\n\t Otto Von Bismarck", "\"A goal without a plan is just a wish.\"" + "\n\n\t Antoine de Saint-Exupery", "\" Avoid negative people at all costs; they hire you out and wear you down.\"" + "\n\n\t Brian Tracy",
            "\"If opportunity doesn't knock, build a door.\"" + "\n\n\t Milton Berle", "\"If you tell the truth, you don't have to remember anything.\"" + "\n\n\t Mark Twain", "\" A great pleasure in life is doing what people say you cannot do.\"" + "\n\n\t Walter Bagehot", "\"The problem with the world is that the intelligence are full of doubts, while the stupid ones are full of confidence.\"" + "\n\n\t Charles Bukowski",
            "\"Life's too short to hang out with people who aren't resourceful.\"" + "\n\n\t Jeff Bezos", "\"When something is important enough, you do it even if the odds are not in your favor.\"" + "\n\n\t Elon Musk", "\"If you're changing the world. You're working on important things. You're excited to get up in the morning.\"" + "\n\n\t Larry Page",
            "\"Real integrity is doing the right thing, knowing that nobody's going to know whether you did or not.\"" + "\n\n\t Oprah Winfre", "\" When you innovate, you've got to be prepared for everyone telling you you're nuts.\"" + "\n\n\t Larry Ellison", "\"The best investment you can make is in yourself.\"" + "\n\n\t Warren Buffet", "\"Some people dream of success, while others wake up and work hard at it.\"" + "\n\n\t Mark Zuckerberg",
            "\"Don't compare yourself with anyone in this world... If you do so, you are insulting yourself.\"" + "\n\n\t Bill Gates", "\"It is difficult to free tools from the chains they revere.\"" + "\n\n\t Voltaire", "\"If you fell down yesterday, stand up today.\"" + "\n\n\t H.G. Wells", "\"What you can do today can improve all your tomorrow.\"" + "\n\n\t Ralph Marston", "\"Either you run the day, or the day runs you.\"" + "\n\n\t Jim Rohn",
            "\"It is never too late to be what you might have been.\"" + "\n\n\t George Eliot", "\"Don't count the days, make the days count.\"" + "\n\n\t Muhammad Ali", "\" Don't wait. \n The time will never be just right.\"" + "\n\n\t Napoleon Hill", "\" A year from now you may wish you had started today.\"" + "\n\n\t Karen Lamb", "\"Someday is not a day of the week.\"" + "\n\n\t Denise Brennan-Nelson", "\"Make each day your masterpiece.\"" + "\n\n\t John Wooden",
            "\"I am tomorrow. Or some future day. What I establish today. I am today what I established yesterday or some previous day.\"", "\" That which do not  kill us makes us stronger.\"" + "\n\n\t Friedrich Nietsche", "\"People don't care about what you say, they care about what you build\"" + "\n\n\t Mark Zuckerberg", "\" Passion should be the fire that drives your life's work.\"" + "\n\n\t Michale Dell", "\" Aspire to inspire before you expire.\"" + "\n\n\t Unknown",
            "\"A garden is always a series of losses set against a few triumphs, like life itself.\"" + "\n\n\t May Sarton", "\" Love your parents. We are so busy growing up, we often forget they are also growing old.\"" + "\n\n\t Unknown", "\"There are no strangers here; Only friends you haven't yet.\"" + "\"\"\" William Butler Yeats", "\"People don't notice whether it is winter or summer when they are happy.\"" + "\n\n\t Anton Chekhov",
            "\"Intelligence is the ability to adapt to change.\"" + "\n\n\t Stephen Hawking", "\"You can buy players, but you can't buy chemistry.\"" + "\n\n\t Deion Sanders", "\"Do not take life too seriously. You will never get out of it alive.\"" + "\" Elbert Hubbard\"", "\"I'm sorry, if you were right, I'd agree with you.\"" + "\n\n\t Robin Williams", "\"Let's have some new cliches\"" + "\n\n\t Samuel Goldwyn", "\"I refuse to join any club that would have me as a member\"" + "\n\n\t Groucho Marx",
            "\"I'm writing a book. I've got the page numbers done\"" + "\n\n\t Steven Wright", "\" We area all born mad. Some remain so.\"" + "\n\n\t Samuel Beckett", "\" The best ideas come as jokes. Make your thinking as funny as possible.\"" + "\n\n\t David Ogilvy", "\"I love Mickey Mouse more than any woman I have ever known.\"" + "\n\n\t Walt Disney", "\"Reality continues to ruin my life.\"" + "\n\n\t Bill Watterson", "\"I do not fear computers. I fear the lack of them.\"" + "\n\n\t Isaac Aimov",
            "\"Treat your password like your toothbrush. Don't let anybody else use it, and get a new one every six months.\"" + "\n\n\t Clifford Stoll", "\"Computers double their performance every month.\"" + "\n\n\t Stephen Hawking", "\"Life is 10% what happens to you and 90% how you react to it.\"" + "\n\n\t Charles R. Swindoll", "\"The science of today is the technology of tomorrow.\"" + "\n\n\t Edward Teller",
            "\"I'm not the smartest fellow in the world, but I can sure pick smart colleagues\"" + "\n\n\t Franklin D. Roosevelt", "\"I may be drunk, Miss, but in the morning I will be sober and you will still be ugly.\"" + "\n\n\t Winston Churchill", "\"A lot of people are afraid of heights. Not me, I'm afraid of widths.\"" + "\n\n\t Steven Wright", "" + "\"If you're going through hell, keep going.\"" + "\n\n\t Winston Churchill", "\"You're only as good as your last haircut.\"" + "\n\n\t Fran Lebowitz",
            "\"I'm sorry, if you were right, I'd agree with you.\"" + "\n\n\t Robin Williams", "\"I intend to live forever. So far, so good.\"" + "\n\n\t Steven Wright", "\"The United States is a nation of laws: badly written and randomly enforced.\"" + "\n\n\t Frank Zappa", "\"Always forgive your enemies - nothing annoys them so much.\"" + "\n\n\t Oscar Wilde", "\"Electricity is really just organized lightning.\"" + "\n\n\t George Carlin", "\"Don't let schooling interfere with your education\"" + "\n\n\t Mark Twain",
            "\"When life gives you questions, google has answers.\"" + "\n\n\t AJ Carpio", "\" I'm not anti-social; I'm just not user friendly.\"" + "\n\n\t T-Shirt", "\"There are 10 types of people in the world: those who understand binary, and those who don't.\"" + "\n\n\t Unknown", "\" I would love to change the world, but they won't give me the source code.\"" + "\n\n\t Unknown", "\"I would love to change the world, but they won't give me the source code.\"" + "\n\n\t Unknown",
            "\"The hard drive on your computer will only crash when it contains vital information that has not been backed up.\"" + "\n\n\t Murphy's Laws of Computers", "\"Everyone stars as a noob. Not everyone ends like a pro...\"" + "\n\n\t Volume 121", "\"I find your lack of faith disturbing.\"" + "\n\n\t Darth Vader, Star Wars", "\" This episode was BADLY written!\"" + "\n\n\t Gwen, Galaxy Quest", "\"Don't call me a mindless philosopher, you overweight blob of grease!\"" + "\n\n\t C3P, Star Wars",
            "\"I know kung fu.\"" + "\n\n\t Neo, The Matrix", "\"Just move to the internet, it's great here. We get to live inside where the weather is always awesome.\"" + "\n\n\t John Green", "\"No one messes around with a nerd's computer and escapes unscathed.\"" + "\n\n\t E.A. Bucchianeri", "\" I'm a geek.\"" + "\n\n\t Bill Gates", "\"I'm a geek. A techie geek.\"" + "\n\n\t Travis Kalanick", "\"Being a geek is all about learning the inventories of things.\"" + "\n\n\t Adam Savagae",
            "\"I'm not a 'Star Wars' geek.\"" + "\n\n\t Danny Boyle", "\"Is mayonnaise an instrument?\"" + "\n\n\t Patrick Star", "\"When the odds are against you, believe in yourself, and you will find your inner super hero.\"" + "\n\n\t Shane Dawson", "\"Life isn't all diamonds and rosé... but it should be.\"" + "\n\n\t Lisa Vanderpump", "\"Shake it like Jello make the boys say hello.\"" + "\n\n\t Missy Elliot", "\"We take the naps we think we deserve.\"" + "\n\n\t Anna Mattia",
            "\"I'm not great at advice, can I interest you in a sarcastic comment?\"" + "\n\n\t Chandler Bing", "\"Immature is a word that boring people use to describe fun people.\"" + "\n\n\t Will Ferrell", "\"I'm sorry, did my shoulders distract you from reading this quote.\"" + "\n\n\t Tori DiPaolo", "\"I am not vegetarian because I love animals; I am vegetarian because I hate plants.\"" + "\n\n\t Ankit Jain", "\"The only time I set the bar low is for limbo.\"" + "\n\n\t Michael Scott, The Office",
            "\"You can't see me.\"" + "\n\n\t John Cena", "\"I get butterflies when I think of myself.\"" + "\n\n\t Garrett Syke", "\"I wanna be the very best, like no one ever was. To catch them is my real test. To train them is my cause.\"" + "\n\n\t Pokemon", "\"I see now that the circumstances of one's birth are irrelevant. It is what you do with the gift of life that determines who you are.\"" + "\n\n\t Mewtwo", "\"Everyone's a critic.\"" + "\n\n\t Splinter, Teenage Mutant Ninja Turtles",
            "\"I am the light in the darkness, ally yo good, nightmare to you!\"" + "\n\n\t Goku from Dragon Ball Z", "\"I don't like defining myself. I just am.\"" + "\n\n\t Britney Spears", "\"My life is violent, but violent is life. Peace is a dream. Reality is a knife.\"" + "\n\n\t ICE-T 'Colors'", "\"They may take our lives, but they'll never take our freedom!\"" + "\n\n\t Braveheart, 1995", "\"If you wear a dress and have an animal sidekick, you're a princess.\"" + "\n\n\t Maui(voice of Dwayne Johnson), 'Moana'",
            "\"The force is with me. I am one with the Force.\"" + "\n\n\t Chirrut Imwe(Donnie Yen), 'Rogue One: A Star Wars Story'", "\"You had me at 'hello'.\"" + "\n\n\t Jerry Maguire", "\"It's a shame you can only die once.\"" + "\n\n\t Dexter", "\"A Lannister always pays his debs.\"" + "\n\n\t Lannister House Motto, Game of Thrones", "\"I'm not in the meth business. I'm in the empire business.\"" + "\n\n\t Walter White","\"If you can quote the rules, then you can obey them.\"" + "\n\n\t Tony Soprano",
            "\"You come at the king, you best not miss!\"" + "\n\n\t Omar Little", "\"There are no men like me. Only me.\"" + "\n\n\t Jaime Lannister", "\"You don't know what it's like out there. You may think you do, but yo don't.\"" + "\n\n\t Rick Grimes","\"Now: Say my name.\"" + "\n\n\t Walter White", "\"Hodor.\"" + "\n\n\t Game of the Thrones", "\"Is any of it real?\"" + "\n\n\t Mr. Robot","\"I'm Ready.\"" + "\n\n\t Parks and Recreation", "\"It's a beautiful day to save lives.\"" + "\n\n\t Grey's Anatomy",
            "\"We're just pawns in the universe's game.\"" + "\n\n\t 90210", "\"Be helpful to others.\"" + "\n\n\t Legends of Tomorrow (Scouts Motto)", "\"You're playing chess without all your pieces on the board.\"" + "\n\n\t Jax (Legends of Tomorrow)", "\"Veni vidi vici.\"" + "\n\n\t Julius Caesar", "\"One of you is one of the least attractive people I've ever met and I'm not going to say which one.\"" + "\n\n\t Erlich Bachman", "\"If they want to negotiate using hostility and rudeness, well, they picked the wrong guy.\"" + "\n\n\t Erlich Bachamn",
            "\"Now I own the Dark Army.\"" + "\n\n\t Elliot (Mr. Robot)", "\" Don't overthink this.\"" + "\n\n\t Darlene (Mr. Robot)", "\"When we lose our principles,we invite chaos.\"" + "\n\n\t Mr. Robot", "\"Bravery is contagious.\"" + "\n\n\t Mr. Robot", "\" You're the one constant in a sea of variables.\"" + "\n\n\t Mr. Robot","\"No one cared who I was until I put on the mask.\"" + "\n\n\t Mr. Robot", "\" There was something amazingly enticing about programming.\"" + "\n\n\t Vint Cerf",
            "\"I never really had the fun teens of exploring the world because I was sitting at home, learning programming.\"" + "\n\n\t Markus Persson","\" But active programming consists of the design of new programs, rather than contemplation of old programs.\"" + "\n\n\t Niklaus Wirth", "\"When someone says: 'I want a programming language in which I need only say what I wish done', give him a lollipop.\"" + "\n\n\t Alan J. Perlis", "\"Talk is cheap. Show me code.\"" + "\n\n\t Linus Torvalds", "\"To iterate is human, to recurse divine.\"" + "\n\n\t L. Peter Deutsch"};

            //"\"Drinking and lust: No man can match me in these things. I am the god of tits and wine.\"" + "\n\n\t Tyrion Lannister};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (TextView) findViewById(R.id.textView);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button) ;
        //Use for random quote
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int num = random.nextInt(quotes.length);
                // int num1 = random.nextInt(quotes[num].length);
                t1.setText(quotes[num]);
                t1.setTextIsSelectable(true); // select the text connect text and copy to clipboard on other places
                b1.setText("More!!!");
            }
        });
    }
    //
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    // Share
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu:
                String toShare = t1.getText().toString();
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, toShare);
                intent.setType("text/plain");
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
