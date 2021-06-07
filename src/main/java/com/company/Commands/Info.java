package com.company.Commands;

import com.company.Command;
import com.company.Main;
import com.company.Models.Writer;
import com.company.Models.user;
import com.company.Writers.Printer;

public class Info extends Command {
    @Override
    public void Execute(boolean is_thread, user user, Writer writer)  {
        if(is_thread){
            Printer.getInstance().WriteLine("начало старта: " + Main.start.toString() + "\r\nкол-во элементов: " + Main.tickets.getTickets().size());
        }
        else {
            writer.getResponces().add("начало старта: " + Main.start.toString() + "\r\nкол-во элементов: " + Main.tickets.getTickets().size());
        }
    }
}