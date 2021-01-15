package thisisshivamgupta.OctoPet;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase(OctoPet.prefix + "info")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("🐱‍👤OctoPet Information");
            info.setDescription("This bot is prepared for MLH Day-5 daily challenges!");
            info.setColor(0xf45642);
            info.setFooter("Created by thisisshivamgupta",event.getMember().getUser().getAvatarUrl());
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }
    }

    }
