import jaggl.OpenGL;

final class aca {

   static int d;
   static int c;
   static int b;
   static Object[] a = sl.a("24", 0, new Object[1], "24");


   static final void a(Object[] var0, byte var1) {
      ++b;
      var0[4] = qoa.a(2, new Object[1], -97, (Object[])((Object[])var0[0]));
      tia.a((Object[])((Object[])var0[4]), 0, var1 - 169);
      if(null == var0 || var0.length != 2) {
         nha.a((Object[])((Object[])var0[0]), 18806, 1);
         fd.a(-16777216, (Object[])((Object[])var0[0]), -112);
         el.a(7681, 30862, 260, (Object[])((Object[])var0[0]));
         db.a(770, (Object[])((Object[])var0[0]), (byte)-68, 0, '\u8576');
         nha.a((Object[])((Object[])var0[0]), var1 ^ 18697, 0);
         OpenGL.glBindProgramARB('\u8620', ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[0]);
         OpenGL.glEnable('\u8620');
         fta.a((byte)78, (Object[])((Object[])var0[4]));
         tia.a((Object[])((Object[])var0[4]), 1, -120);
         nha.a((Object[])((Object[])var0[0]), 18806, 1);
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadIdentity();
         OpenGL.glMatrixMode(5888);
         za.a(0, -20929, (Object[])((Object[])var0[0]));
         db.a(770, (Object[])((Object[])var0[0]), (byte)-68, 0, 5890);
         if(var1 == 127) {
            nha.a((Object[])((Object[])var0[0]), 18806, 0);
            OpenGL.glBindProgramARB('\u8620', 0);
            OpenGL.glDisable('\u8620');
            OpenGL.glDisable('\u8804');
            fta.a((byte)121, (Object[])((Object[])var0[4]));
         }
      }
   }

   static final void b(Object[] var0, byte var1) {
      int var2 = 36 / ((var1 + 62) / 44);
      if(null == var0[1]) {
         var0[1] = new int[3];
      }

      ++d;
   }

   static final Object[] a(Object[] var0, int var1) {
      ++c;
      Object[] var2;
      if(null == jca.s) {
         Object[] var4 = new Object[2];
         var2 = var4;
      } else {
         var2 = jca.s;
         jca.s = (Object[])((Object[])jca.s[0]);
         --nf.e;
         var2[0] = null;
      }

      int var3 = -30 / ((49 - var1) / 49);
      var2[1] = var0;
      return var2;
   }

}
