package thisisshivamgupta.OctoPet;


import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;

import javax.security.auth.login.LoginException;

public class OctoPet {
public static JDA jda;
public static String prefix = "~";
//main method
public static void main(String[] args) throws LoginException {
    jda= new JDABuilder(AccountType.BOT).setToken("Nzk5NjA3NzkzNjg2NDEzMzgz.YAGCyg.8dRH9aAh6FlEKJW9mDhm7MvrjBQ").build();
    jda.getPresence().setStatus(OnlineStatus.IDLE);
    jda.getPresence().setGame(Game.playing("Your Server!"));
    jda.addEventListener(new Commands());

}
}





