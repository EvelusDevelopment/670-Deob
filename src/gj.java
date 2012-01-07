import jaggl.OpenGL;

final class gj {

   static int f_ab;
   static int G;
   static int F;
   static int f_tb;
   static int f_cb;
   static int T;
   static Object[] w = a("Ceci est la console de développement. Pour la fermer, appuyez sur les touches `, ² ou §.", new Object[1], "This is the developer console. To close, press the `, ² or § keys on your keyboard.", "Das ist die Entwicklerkonsole. Zum Schließen, die Tasten `, ² or § drücken.", "Este é o painel de controle do desenvolvedor. Para fechar, pressione `, ² ou §.", (byte)-45);
   static int n;
   static int f_lb;
   static Object[] f_rb = a("Une erreur s\'est produite lors de l\'exécution de la commande.", new Object[1], "There was an error executing the command.", "Es gab einen Fehler beim Ausführen des Befehls.", "Houve um erro quando o comando foi executado.", (byte)-118);
   static int b;
   static int k;
   static Object[] x = a("Commande inconnue : ", new Object[1], "Unknown developer command: ", "Unbekannter Befehl: ", "Comando desconhecido: ", (byte)-86);
   static Object[] L = a("Annuler", new Object[1], "Cancel", "Abbrechen", "Cancelar", (byte)-63);
   static Object[] f_i;
   static Object[] J;
   static Object[] xb;
   static Object[] f_eb;
   static Object[] f_ub;
   static Object[] a;
   static Object[] f_kb;
   static Object[] f_vb;
   static Object[] y;
   static Object[] s;
   static Object[] W;
   static Object[] f_gb;
   static Object[] g;
   static Object[] Q;
   static Object[] Z;
   static Object[] H;
   static Object[] f_mb;
   static Object[] f_pb;
   static Object[] V;
   static Object[] f_l;
   static Object[] f_qb;
   static Object[] r;
   static Object[] S;
   static Object[] f_db;
   static Object[] E;
   static Object[] t;
   static Object[] f_ob;
   static Object[] f_sb;
   static Object[] m;
   static Object[] e;
   static Object[] h;
   static Object[] M;
   static Object[] f_bb;
   static Object[] Y;
   static Object[] B;
   static Object[] A;
   static Object[] j;
   static Object[] o;
   static Object[] f_jb;
   static Object[] q;
   static Object[] f;
   static Object[] f_nb;
   static Object[] R;
   static Object[] K;
   static Object[] f_ib;
   static Object[] P;
   static Object[] v;
   static Object[] f_wb;
   static Object[] u;
   static Object[] d;
   static Object[] N;
   static Object[] f_hb;
   static Object[] C;
   static Object[] U;
   static Object[] X;
   static Object[] z;
   static Object[] c;
   static Object[] I;
   static Object[] f_fb;
   static Object[] p;
   static Object[][] O;
   static short[] D;


   static final void a(Object[] var0, int var1, float[] var2, byte var3, int var4) {
      ++f_lb;
      if(var3 <= 100) {
         q = (Object[])((Object[])I[0]);
      }

      qo.a(var2, 0, (float[])((float[])var0[5]), 4 * var4, var1);
      ((boolean[])((boolean[])var0[8]))[1] = true;
   }

   static final Object[] a(Object[] var0, boolean var1, Object[] var2) {
      ++f_ab;
      ipa.c(var2, (byte)12);
      if(var1) {
         return (Object[])null;
      } else {
         hp.a(var0, var2, 27468);
         qr.a(var2, (int)0);
         if(((boolean[])((boolean[])var0[17]))[4]) {
            var2[2] = qoa.a(2, new Object[1], 120, var0);
            if(null != var2 && -5 == ~var2.length && var2[0].equals(Integer.valueOf(2))) {
               return null;
            }

            tia.a((Object[])((Object[])var2[2]), 0, -101);
            nha.a((Object[])((Object[])var2[0]), 18806, 1);
            el.a(7681, 30862, '\u8575', (Object[])((Object[])var2[0]));
            af.a(770, (Object[])((Object[])var2[0]), 30579, '\u8578', 2);
            db.a(770, (Object[])((Object[])var2[0]), (byte)-68, 0, '\u8577');
            OpenGL.glTexGeni(8192, 9472, '\u8512');
            OpenGL.glTexGeni(8193, 9472, '\u8512');
            OpenGL.glTexGeni(8194, 9472, '\u8512');
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            nha.a((Object[])((Object[])var2[0]), 18806, 0);
            fta.a((byte)117, (Object[])((Object[])var2[2]));
            tia.a((Object[])((Object[])var2[2]), 1, -124);
            nha.a((Object[])((Object[])var2[0]), 18806, 1);
            el.a(8448, 30862, 8448, (Object[])((Object[])var2[0]));
            af.a(770, (Object[])((Object[])var2[0]), 30579, '\u8576', 2);
            db.a(770, (Object[])((Object[])var2[0]), (byte)-68, 0, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            nha.a((Object[])((Object[])var2[0]), 18806, 0);
            fta.a((byte)84, (Object[])((Object[])var2[2]));
         }

         return var2;
      }
   }

   static final void a(Object[] var0, int var1, boolean var2) {
      ++b;
      int var3 = -86 / ((66 - var1) / 52);
   }

   static final String a(int var0, int var1, Object[] var2) {
      int var3 = 106 % ((var1 - 15) / 43);
      ++f_tb;
      return ((String[])((String[])var2[0]))[var0];
   }

   static final re a(Object[] var0, int var1, byte var2) {
      ++f_cb;
      if(null != var0 && var0.length == 8) {
         return pk.a((byte)-128, var1, var0);
      } else {
         if(var2 <= 29) {
            ((boolean[])((boolean[])r[2]))[26] = true;
         }

         re var3;
         if(null != var0 && var0.length == 11) {
            Object[] var4;
            var3 = (re)(null == (var4 = vna.a(var1, new Object[3], var0, 99))?null:var4[2]);
            return var3;
         } else if(var0 != null && var0.length == 15) {
            Object[] var6 = new Object[4];
            lq.a(true, var6);
            oha var8 = new oha(var6);
            var6[0] = var8;
            var6[2] = var0;
            ((int[])((int[])var6[1]))[0] = var1;
            var3 = (re)(var6 == null?null:var6[0]);
            return var3;
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final String a(int var0, Object[] var1) {
      ++G;
      int var2 = 26 % ((-20 - var0) / 49);
      return (String)var1[3] + el.a(16777215, 0) + " >";
   }

   static final void a(int var0, Object[] var1, Object[] var2, boolean var3) {
      try {
         ++T;
         if(((boolean[])((boolean[])var2[17]))[8]) {
            var2[3] = var1;
            ((int[])((int[])var2[1]))[36] = var0;
            if(((boolean[])((boolean[])var2[17]))[24]) {
               tba.a((Object[])((Object[])((Object[])((Object[])var2[12]))[4]), (byte)-91);
               iw.a((Object[])((Object[])((Object[])((Object[])var2[12]))[4]), true);
            }

            if(!var3) {
               h = (Object[])((Object[])((Object[])((Object[])f_ib[0]))[5]);
            }

         } else {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var5) {
         throw vt.a(var5, "gj.D(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ')');
      }
   }

   static final Object[] a(Object[] var0, Object[] var1, Object[] var2, int var3, int var4) {
      var1[1] = sj.a(64, new Object[3], (byte)-97);
      ++n;
      var1[0] = var2;
      if(var3 != 1550) {
         return (Object[])null;
      } else {
         jla.a((Object[])((Object[])var1[0]), (byte)-95, 31);
         return var1;
      }
   }

   private static final Object[] a(String var0, Object[] var1, String var2, String var3, String var4, byte var5) {
      var1[0] = new String[]{var2, var3, var0, var4};
      if(var5 > -12) {
         return (Object[])null;
      } else {
         ++k;
         return var1;
      }
   }

   static final int a(int var0, int var1, boolean var2, int var3, boolean var4) {
      ++F;
      Object[] var5 = fk.a(Integer.MIN_VALUE, var3, var2);
      if(null == var5) {
         return 0;
      } else {
         int var6 = 0;
         if(null != var5 && (var5.length == 7 && var5[4].equals(Boolean.valueOf(false)) || var5.length == 2)) {
            mda.a((byte)88);
         }

         for(int var7 = 0; ((int[])((int[])var5[2])).length > var7; ++var7) {
            if(((int[])((int[])var5[2]))[var7] >= 0 && ((int[])((int[])var5[2]))[var7] < ((int[])((int[])cqa.a[1]))[0]) {
               Object[] var8 = us.a(((int[])((int[])var5[2]))[var7], (byte)39, cqa.a);
               int var9 = jfa.a(false, var0, var8, ((int[])((int[])jd.a(var0, (byte)-123, bm.c)[1]))[0]);
               if(var4) {
                  var6 += ((int[])((int[])var5[0]))[var7] * var9;
               } else {
                  var6 += var9;
               }
            }
         }

         if(var1 != 32432) {
            a((Object[])null, ((int[])((int[])f[13]))[26], (float[])((float[])f_i[15]), (byte)59, ((int[])((int[])q[2]))[10]);
         }

         return var6;
      }
   }

   static {
      a("#Joueur", new Object[1], "#Player", "#Spieler", "#Jogador", (byte)-33);
      f_i = a("Objet d\'abonnés", new Object[1], "Members object", "Gegenstand für Mitglieder", "Objeto para membros", (byte)-23);
      a("Connectez-vous à un serveur d\'abonnés pour utiliser cet objet.", new Object[1], "Login to a members\' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Acesse um servidor para membros para usar este objeto.", (byte)-14);
      a("Échangez ce reçu contre l\'objet correspondant dans la banque de votre choix.", new Object[1], "Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.", (byte)-91);
      J = a("Jeter", new Object[1], "Discard", "Ablegen", "Descartar", (byte)-74);
      xb = a("Jeter", new Object[1], "Discard", "Ablegen", "Descartar", (byte)-103);
      f_eb = a("Prendre", new Object[1], "Take", "Nehmen", "Pegar", (byte)-46);
      f_ub = a("Poser", new Object[1], "Drop", "Fallen lassen", "Largar", (byte)-103);
      a("OK", new Object[1], "Ok", "Okay", "Ok", (byte)-105);
      a("Sélectionner", new Object[1], "Select", "Auswählen", "Selecionar", (byte)-43);
      a = a("Continuer", new Object[1], "Continue", "Weiter", "Continuar", (byte)-115);
      a("Nom de joueur incorrect.", new Object[1], "Invalid player name.", "Unzulässiger Charaktername!", "Nome de jogador inválido.", (byte)-61);
      a("Vous ne pouvez pas vous signaler vous-même !", new Object[1], "You can\'t report yourself!", "Du kannst dich nicht selbst melden!", "Você não pode denunciar a si próprio!", (byte)-112);
      a("Vous avez signalé trop d’abus pour aujourd’hui. N’abusez pas de ce système !", new Object[1], "You have sent too many abuse reports today! Do not abuse this system!", "Du hast heute schon zu viele Regelverstöße gemeldet! Missbrauch das System nicht!", "Você já denunciou abuso muitas vezes hoje. Não abuse do sistema!", (byte)-20);
      a("Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d\'identité.", new Object[1], "You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.", (byte)-72);
      a("Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", new Object[1], "You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao nome.", (byte)-96);
      a("Vous pouvez signaler cette personne pour une autre infraction aux règles.", new Object[1], "You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.", (byte)-93);
      a("Merci, nous avons bien reçu votre rapport d\'abus.", new Object[1], "Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Obrigado. Sua denúncia de abuso foi recebida.", (byte)-79);
      a("Impossible de signaler un abus - Erreur système", new Object[1], "Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.", (byte)-25);
      a("Nom incorrect", new Object[1], "Invalid name", "Unzulässiger Name!", "Nome inválido", (byte)-105);
      a("Veuillez vous connecter à un serveur d\'abonnés pour utiliser cet objet.", new Object[1], "To use this item please login to a members\' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Acesse um servidor para membros para usar este objeto.", (byte)-85);
      a("Veuillez vous connecter à un serveur d\'abonnés pour cette interaction.", new Object[1], "To interact with this please login to a members\' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Para interagir, acesse um servidor para membros.", (byte)-36);
      a("Il ne se passe rien d\'intéressant.", new Object[1], "Nothing interesting happens.", "Nichts Interessantes passiert.", "Nada de interessante acontece.", (byte)-48);
      a("Vous ne pouvez pas l\'atteindre.", new Object[1], "You can\'t reach that.", "Da kommst du nicht hin.", "Você não consegue alcançar isso.", (byte)-62);
      a("Téléportation non valide !", new Object[1], "Invalid teleport!", "Unzulässiger Teleport!", "Teleporte inválido!", (byte)-57);
      a("Vous devez vous connecter à un serveur d\'abonnés pour aller à cet endroit.", new Object[1], "To go here you must login to a members\' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Para entrar aqui, acesse um servidor para membros.", (byte)-63);
      a("Impossible d\'ajouter un ami - système occupé.", new Object[1], "Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Não foi possível adicionar o amigo. O sistema está ocupado.", (byte)-118);
      a("Impossible d\'ajouter l\'ami - joueur inconnu.", new Object[1], "Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Não foi possível adicionar um amigo - jogador desconhecido.", (byte)-92);
      a("Impossible d\'ajouter un nom - système occupé.", new Object[1], "Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Não foi possível adicionar o nome. O sistema está ocupado.", (byte)-70);
      a("Impossible d\'ajouter le nom - joueur inconnu.", new Object[1], "Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Não foi possível adicionar um nome - jogador desconhecido.", (byte)-83);
      f_kb = a("Votre liste d\'amis est pleine (200 noms maximum).", new Object[1], "Your friends list is full (200 names maximum)", "Deine Freunde-Liste ist voll, du hast das Maximum von 200 erreicht.", "Sua lista de amigos está cheia. O limite é 200.", (byte)-33);
      a("Impossible de supprimer un ami - système occupé.", new Object[1], "Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Não foi possível excluir o amigo. O sistema está ocupado.", (byte)-24);
      a("Impossible d\'effacer le nom - système occupé.", new Object[1], "Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Não foi possível deletar o nome - sistema ocupado.", (byte)-127);
      a("Impossible d\'envoyer un message - système occupé.", new Object[1], "Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Não foi possível enviar a mensagem. O sistema está ocupado.", (byte)-14);
      a("Impossible d\'envoyer un message - joueur indisponible.", new Object[1], "Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Não foi possível enviar a mensagem. O jogador não está disponível.", (byte)-83);
      a((String)null, new Object[1], (String)null, "der Spieler ist momentan nicht verfügbar.", (String)null, (byte)-113);
      a("Impossible d\'envoyer un message - joueur non inclus dans votre liste d\'amis.", new Object[1], "Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.", (byte)-98);
      a((String)null, new Object[1], (String)null, "Spieler nicht auf deiner Freunde-Liste.", (String)null, (byte)-57);
      a("Il semble que vous révéliez votre mot de passe à quelqu\'un - ne faites jamais ça !", new Object[1], "You appear to be telling someone your password - please don\'t!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Parece que você está revelando sua senha a alguém. Não faça isso!", (byte)-36);
      a("Si ce n\'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", new Object[1], "If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Caso não esteja, altere sua senha para algo mais obscuro!", (byte)-40);
      a("Impossible d\'envoyer le message - enregistrez un nom de personnage en vous connectant au jeu.", new Object[1], "Unable to send message - set your display name first by logging into the game.", "Nachricht konnte nicht gesendet werden.  Bitte richte erst deinen Charakternamen ein, ", "Não é possível enviar a mensagem. Defina um nome de personagem antes, fazendo login no jogo.", (byte)-28);
      a((String)null, new Object[1], (String)null, "indem du dich ins Spiel einloggst.", (String)null, (byte)-64);
      a("Cette règle n\'est invocable que pour les discussions ou échanges récents.", new Object[1], "For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.", (byte)-18);
      a((String)null, new Object[1], (String)null, "die kürzlich gesprochen oder gehandelt haben.", (String)null, (byte)-29);
      a("Ce joueur est déconnecté ou en mode privé.", new Object[1], "That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "O jogador está offline ou está com o modo de privacidade ativado.", (byte)-90);
      a("Impossible d\'envoyer un message rapide à un joueur de ce serveur à l\'heure actuelle.", new Object[1], "You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.", (byte)-89);
      a((String)null, new Object[1], (String)null, "geschickt werden.", (String)null, (byte)-20);
      a("Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", new Object[1], "This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.", (byte)-92);
      a("Messagerie désactivée", new Object[1], "Chat disabled", "Deaktiviert", "Bate-papo desativado", (byte)-112);
      a("friends_chat", new Object[1], "friends_chat", "friends_chat", "friends_chat", (byte)-31);
      a("Vous ne faites pas partie d\'un canal de discussion.", new Object[1], "You are not currently in a friends chat channel.", "Du befindest dich derzeit nicht in einem Freundes-Chatraum.", "No momento, você não está no bate-papo entre amigos.", (byte)-55);
      a("Vous n\'êtes pas autorisé à parler dans ce canal de discussion.", new Object[1], "You are not allowed to talk in this friends chat channel.", "Du darfst in diesem Freundes-Chatraum nicht reden.", "Você pode falar neste bate-papo entre amigos.", (byte)-23);
      a("Erreur lors de l\'envoi de ce message – veuillez réessayer ultérieurement !", new Object[1], "Error sending message to friends chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erro ao enviar mensagem para bate-papo entre amigos - favor tentar novamente mais tarde!", (byte)-124);
      a("Veuillez attendre d\'être déconnecté(e) de votre canal précédent.", new Object[1], "Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Aguarde até se desconectar do canal anterior.", (byte)-80);
      a("Vous n\'êtes dans aucun canal à l\'heure actuelle.", new Object[1], "You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "No momento você não está em um canal.", (byte)-37);
      a("Tentative de connexion au canal...", new Object[1], "Attempting to join channel...", "Chatraum wird betreten...", "Tentando acessar canal...", (byte)-103);
      a("Envoi de la demande de sortie du canal...", new Object[1], "Sending request to leave channel...", "Chatraum wird verlassen...", "Enviando solicitação para deixar o canal...", (byte)-121);
      a("Tentative de connexion au canal déjà en cours - veuillez patienter...", new Object[1], "Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Já há uma tentativa de entrar em um canal. Aguarde...", (byte)-22);
      a("Demande de sortie déjà effectuée - veuillez patienter...", new Object[1], "Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Solicitação de saída já em andamento. Aguarde...", (byte)-80);
      a("Nom de canal incorrect !", new Object[1], "Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nome de canal inválido!", (byte)-49);
      a("Vous ne pouvez pas rejoindre ce canal de discussion pour le moment - veuillez réessayer ultérieurement !", new Object[1], "Unable to join friends chat at this time - please try again later!", "Freundes-Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Não foi possível participar do bate-papo entre amigos - favor tentar novamente mais tarde!", (byte)-25);
      a("Vous participez actuellement au canal de discussion : ", new Object[1], "Now talking in friends chat channel ", "Freundes-Chatraum: ", "Falando no momento no bate-papo entre amigos: ", (byte)-78);
      a("Vous participez actuellement au canal de discussion du joueur : ", new Object[1], "Now talking in friends chat channel of player: ", "Freundes-Chat dieses Spielers beigetreten: ", "Falando no momento no bate-papo entre amigos do jogador: ", (byte)-77);
      a("Erreur lors de la connexion au canal de discussion - veuillez réessayer ultérieurement !", new Object[1], "Error joining friends chat channel - please try again later!", "Fehler beim Betreten des Freundes-Chatraums - bitte versuch es später erneut.", "Erro ao participar do bate-papo entre-amigos - favor tentar novamente mais tarde!", (byte)-78);
      a("Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", new Object[1], "You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!", (byte)-16);
      a("Le canal que vous essayez de rejoindre n\'existe pas.", new Object[1], "The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "O canal que você tentou acessar não existe.", (byte)-49);
      a("Le canal que vous essayez de rejoindre est plein.", new Object[1], "The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "O canal que você tentou acessar está cheio no momento.", (byte)-42);
      a("Votre rang n\'est pas assez élevé pour rejoindre ce canal de discussion.", new Object[1], "You do not have a high enough rank to join this friends chat channel.", "Dein Rang reicht nicht aus, um diesen Freundes-Chatraum zu betreten.", "Você não tem uma classificação alta o suficiente para participar deste bate-papo entre amigos.", (byte)-41);
      a("Vous avez été exclu temporairement de ce canal de discussion.", new Object[1], "You are temporarily banned from this friends chat channel.", "Du wurdest temporär von diesem Freundes-Chatraum gesperrt.", "Você foi temporariamente banido deste bate-papo entre amigos.", (byte)-94);
      a("Vous n\'êtes pas autorisé à rejoindre le canal de discussion de cet utilisateur.", new Object[1], "You are not allowed to join this user\'s friends chat channel.", "Du darfst den Freundes-Chatraum dieses Benutzers nicht betreten.", "Você não pode participar do bate-papo entre amigos deste usuário.", (byte)-33);
      a(" a rejoint le canal.", new Object[1], " joined the channel.", " hat den Chatraum betreten.", " entrou no canal.", (byte)-54);
      a(" a quitté le canal.", new Object[1], " left the channel.", " hat den Chatraum verlassen.", " deixou o canal.", (byte)-92);
      a(" a été expulsé du canal.", new Object[1], " was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " foi expulso do canal.", (byte)-16);
      a("Vous avez été expulsé du canal.", new Object[1], "You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Você foi expulso do canal.", (byte)-99);
      a("Vous avez été supprimé de ce canal.", new Object[1], "You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Você foi retirado desse canal.", (byte)-75);
      a("Vous avez quitté le canal.", new Object[1], "You have left the channel.", "Du hast den Chatraum verlassen.", "Você saiu do canal.", (byte)-105);
      a("Votre canal de discussion est maintenant activé !", new Object[1], "Your friends chat channel has now been enabled!", "Dein Freundes-Chat ist jetzt eingeschaltet.", "O seu bate-papo entre amigos foi ativado!", (byte)-119);
      a("Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", new Object[1], "Join your channel by clicking \'Join Chat\' and typing: ", "Klick auf \'Betreten\' und gib ein: ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ", (byte)-21);
      a("Votre canal de discussion est maintenant désactivé !", new Object[1], "Your friends chat channel has now been disabled!", "Dein Freundes-Chat ist jetzt ausgeschaltet.", "O seu bate-papo entre amigos foi desativado!", (byte)-78);
      a("Vous n\'êtes pas autorisé à expulser des utilisateurs de ce canal.", new Object[1], "You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Você não tem permissão para expulsar usuários neste canal.", (byte)-123);
      a("Vous n\'êtes pas autorisé à expulser cet utilisateur.", new Object[1], "You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Você não tem permissão para expulsar este usuário.", (byte)-112);
      a("Cet utilisateur n\'est pas dans ce canal.", new Object[1], "That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Esse usuário não está no canal.", (byte)-55);
      a("Votre demande d\'exclusion de ce joueur a été acceptée.", new Object[1], "Your request to kick/ban this user was successful.", "Der Rauswurf/die Sperrung war erfolgreich.", "Seu pedido para expulsar/suspender este jogador foi bem sucedido.", (byte)-107);
      a("Le renouvellement d\'exclusion temporaire de ce joueur a été accepté.", new Object[1], "Your request to refresh this user\'s temporary ban was successful.", "Die Verlängerung der temporären Sperrung dieses Spielers war erfolgreich.", "Seu pedido para reiniciar a suspensão temporária deste jogador foi bem sucedido.", (byte)-80);
      a("La messagerie instantanée a été temporairement bloquée suite à une infraction.", new Object[1], "You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "Você foi temporariamente vetado por ter violado uma regra.", (byte)-103);
      a("Votre accès restera bloqué encore ", new Object[1], "This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Este veto permanecerá por mais ", (byte)-93);
      a(" jours.", new Object[1], " days.", " Tage.", " dias.", (byte)-22);
      a("Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", new Object[1], "You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "O veto será retirado dentro de 24 horas.", (byte)-112);
      a("Pour éviter un nouveau blocage, lisez le règlement.", new Object[1], "To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Para evitar outros vetos, leia as regras.", (byte)-41);
      a("L\'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", new Object[1], "You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "Você foi permanentemente vetado por ter violado uma regra.", (byte)-51);
      f_vb = a("Chargement en cours. Veuillez patienter.", new Object[1], "Loading - please wait.", "Ladevorgang - bitte warte.", "Carregando. Aguarde.", (byte)-82);
      y = a("Profilage...", new Object[1], "Profiling...", "Profiling...", "Profiling...", (byte)-62);
      s = a("Connexion perdue.", new Object[1], "Connection lost.", "Verbindung abgebrochen.", "Conexão perdida.", (byte)-85);
      W = a("Veuillez patienter - tentative de rétablissement.", new Object[1], "Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Tentando reestabelecer conexão. Aguarde.", (byte)-25);
      f_gb = a("Vérification des mises à jour - ", new Object[1], "Checking for updates - ", "Suche nach Updates - ", "Verificando atualizações - ", (byte)-111);
      g = a("Chargement des MAJ - ", new Object[1], "Fetching Updates - ", "Lade Update - ", "Carregando atualizações - ", (byte)-122);
      a("Chargement des fichiers config - ", new Object[1], "Loading config - ", "Lade Konfiguration - ", "Carregando config - ", (byte)-86);
      a("Fichiers config chargés", new Object[1], "Loaded config", "Konfig geladen.", "Config carregada", (byte)-76);
      a("Chargement des sprites - ", new Object[1], "Loading sprites - ", "Lade Sprites - ", "Carregando sprites - ", (byte)-105);
      a("Sprites chargés", new Object[1], "Loaded sprites", "Sprites geladen.", "Sprites carregados", (byte)-100);
      a("Chargement du module texte - ", new Object[1], "Loading wordpack - ", "Lade Wordpack - ", "Carregando pacote de palavras - ", (byte)-54);
      a("Module texte chargé", new Object[1], "Loaded wordpack", "Wordpack geladen.", "Pacote de palavras carregado", (byte)-117);
      a("Chargement des interfaces - ", new Object[1], "Loading interfaces - ", "Lade Benutzeroberfläche - ", "Carregando interfaces - ", (byte)-39);
      a("Interfaces chargées", new Object[1], "Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces carregadas", (byte)-80);
      a("Chargement des interfaces - ", new Object[1], "Loading interface scripts - ", "Lade Interface-Skripte - ", "Carregando interfaces - ", (byte)-71);
      a("Interfaces chargées", new Object[1], "Loaded interface scripts", "Interface-Skripte geladen", "Interfaces carregadas", (byte)-16);
      a("Chargement de polices secondaires - ", new Object[1], "Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Carregando fontes principais - ", (byte)-44);
      a("Polices secondaires chargées", new Object[1], "Loaded additional fonts", "Zusatzschriftarten geladen", "Fontes principais carregadas", (byte)-101);
      a("Chargement de la mappemonde - ", new Object[1], "Loading world map - ", "Lade Weltkarte - ", "Carregando mapa-múndi - ", (byte)-124);
      a("Mappemonde chargée", new Object[1], "Loaded world map", "Weltkarte geladen", "Mapa-múndi carregado", (byte)-49);
      a("Chargement de la liste des serveurs", new Object[1], "Loading world list data", "Lade Liste der Welten", "Carregando dados da lista de mundos", (byte)-102);
      a("Liste des serveurs chargée", new Object[1], "Loaded world list data", "Liste der Welten geladen", "Dados da lista de mundos carregados", (byte)-122);
      a("Variables du client chargées", new Object[1], "Loaded client variable data", "Client-Variablen geladen", "As variáveis do sistema foram carregadas", (byte)-71);
      Q = a("Chargement en cours...", new Object[1], "Loading...", "Lade...", "Carregando...", (byte)-27);
      a("Fermez l\'interface que vous avez ouverte avant d\'utiliser le bouton « Signaler un abus ».", new Object[1], "Please close the interface you have open before using \'Report Abuse\'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".", (byte)-70);
      a((String)null, new Object[1], (String)null, "bevor du die Option \'Regelverstoß melden\' benutzt.", (String)null, (byte)-27);
      a("Mise à jour système dans : ", new Object[1], "System update in: ", "System-Update in: ", "Atualização do sistema em: ", (byte)-101);
      Z = a(" s\'est connecté.", new Object[1], " has logged in.", " loggt sich ein.", " entrou no jogo.", (byte)-15);
      H = a(" s\'est déconnecté.", new Object[1], " has logged out.", " loggt sich aus.", " saiu do jogo.", (byte)-126);
      f_mb = a("Impossible de trouver ", new Object[1], "Unable to find ", "Spieler kann nicht gefunden werden: ", "Não é possível encontrar ", (byte)-32);
      a("Utiliser", new Object[1], "Use", "Benutzen", "Usar", (byte)-94);
      f_pb = a("Examiner", new Object[1], "Examine", "Untersuchen", "Examinar", (byte)-63);
      V = a("Attaquer", new Object[1], "Attack", "Angreifen", "Atacar", (byte)-100);
      f_l = a("Choisir une option", new Object[1], "Choose Option", "Wähl eine Option", "Selecionar opção", (byte)-16);
      f_qb = a(" autres options", new Object[1], " more options", " weitere Optionen", " mais opções", (byte)-38);
      r = a("Atteindre", new Object[1], "Walk here", "Hierhin gehen", "Caminhar para cá", (byte)-34);
      S = a("Regarder dans cette direction", new Object[1], "Face here", "Hierhin drehen", "Virar para cá", (byte)-62);
      f_db = a("niveau ", new Object[1], "level: ", "Stufe: ", "nível: ", (byte)-16);
      E = a("compétence ", new Object[1], "skill: ", "Fertigkeit: ", "habilidade: ", (byte)-51);
      t = a("classement ", new Object[1], "rating: ", "Kampfstufe: ", "qualificação: ", (byte)-55);
      f_ob = a("Veuillez attendre", new Object[1], "Please wait...", "Bitte warte...", "Aguarde...", (byte)-30);
      a("Fermez l\'interface que vous avez ouverte avant d\'utiliser le bouton « Signaler un abus ».", new Object[1], "Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".", (byte)-113);
      f_sb = a(" ", new Object[1], " ", ": ", " ", (byte)-60);
      m = a("M", new Object[1], "M", "M", "M", (byte)-103);
      e = a("M", new Object[1], "M", "M", "M", (byte)-109);
      h = a("K", new Object[1], "K", "T", "K", (byte)-123);
      M = a("K", new Object[1], "K", "T", "K", (byte)-39);
      a("De", new Object[1], "From", "Von:", "De", (byte)-56);
      f_bb = a("Moi", new Object[1], "Self", "Mich", "Eu", (byte)-71);
      Y = a(" est déjà dans votre liste d\'amis.", new Object[1], " is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " já está na sua lista de amigos.", (byte)-111);
      B = a("Votre liste noire est pleine (100 noms maximum).", new Object[1], "Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Sua lista de ignorados está cheia. O limite é 100 usuários.", (byte)-119);
      A = a(" est déjà dans votre liste noire.", new Object[1], " is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " já está na sua lista de ignorados.", (byte)-19);
      j = a("Vous ne pouvez pas ajouter votre nom à votre liste d\'amis.", new Object[1], "You can\'t add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Você não pode adicionar a si próprio à sua lista de amigos.", (byte)-104);
      o = a("Vous ne pouvez pas ajouter votre nom à votre liste noire.", new Object[1], "You can\'t add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Você não pode adicionar a si próprio à sua lista de ignorados.", (byte)-128);
      a("Les modifications seront apportés à votre canal de discussion dans les 60 prochaines secondes.", new Object[1], "Changes will take effect on your friends chat in the next 60 seconds.", "Die Änderungen am Freundes-Chat werden innerhalb von 60 Sekunden übernommen.", "Mundanças vão ocorrer em seu bate-papo entre amigos nos próximos 60 segundos.", (byte)-20);
      f_jb = a("Veuillez commencer par supprimer ", new Object[1], "Please remove ", "Bitte entferne ", "Remova ", (byte)-23);
      q = a(" de votre liste noire.", new Object[1], " from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " da sua lista de ignorados primeiro.", (byte)-79);
      f = a("Veuillez commencer par supprimer ", new Object[1], "Please remove ", "Bitte entferne ", "Remova ", (byte)-44);
      f_nb = a(" de votre liste d\'amis.", new Object[1], " from your friends list first.", " zuerst von deiner Freunde-Liste!", " da sua lista de amigos primeiro.", (byte)-110);
      R = a("jaune:", new Object[1], "yellow:", "gelb:", "amarelo:", (byte)-74);
      K = a("rouge:", new Object[1], "red:", "rot:", "vermelho:", (byte)-95);
      f_ib = a("vert:", new Object[1], "green:", "grün:", "verde:", (byte)-92);
      P = a("cyan:", new Object[1], "cyan:", "blaugrün:", "cyan:", (byte)-47);
      v = a("violet:", new Object[1], "purple:", "lila:", "roxo:", (byte)-84);
      f_wb = a("blanc:", new Object[1], "white:", "weiss:", "branco:", (byte)-32);
      u = a("clignotant1:", new Object[1], "flash1:", "blinken1:", "flash1:", (byte)-102);
      d = a("clignotant2:", new Object[1], "flash2:", "blinken2:", "flash2:", (byte)-60);
      N = a("clignotant3:", new Object[1], "flash3:", "blinken3:", "brilho3:", (byte)-99);
      f_hb = a("brillant1:", new Object[1], "glow1:", "leuchten1:", "brilho1:", (byte)-32);
      C = a("brillant2:", new Object[1], "glow2:", "leuchten2:", "brilho2:", (byte)-79);
      U = a("brillant3:", new Object[1], "glow3:", "leuchten3:", "brilho3:", (byte)-19);
      X = a("ondulation:", new Object[1], "wave:", "welle:", "onda:", (byte)-50);
      z = a("ondulation2:", new Object[1], "wave2:", "welle2:", "onda2:", (byte)-94);
      c = a("tremblement:", new Object[1], "shake:", "schütteln:", "tremor:", (byte)-117);
      I = a("déroulement:", new Object[1], "scroll:", "scrollen:", "rolagem:", (byte)-46);
      f_fb = a("glissement:", new Object[1], "slide:", "gleiten:", "deslizamento:", (byte)-66);
      a("Ami", new Object[1], "Friend", "Freund", "Amigo", (byte)-114);
      p = ed.a(2, new Object[1], (byte)-102, 91);
   }
}
