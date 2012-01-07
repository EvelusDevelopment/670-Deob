
final class ji {

   static Object[] d = ho.a(3, 75, new Object[1], true);
   static int f = 0;
   static int e;
   static int f_i;
   static int a;
   static int h;
   static int c = 0;
   static int j;
   static int g;
   static int b;


   static final int a(Object[] var0, byte var1) {
      ++h;
      Object[] var2 = (Object[])((Object[])var0[42]);
      if(var2[11] != null) {
         var2 = ria.a(eo.g, var2, -95);
         if(null == var2) {
            return -1;
         }
      }

      int var3 = ((int[])((int[])var2[1]))[27];
      Object[] var4 = ro.a((int)3, var0);
      int var5 = lt.a((byte)-64, (Object[])((Object[])var0[30]));
      if(~var5 != 0 && !((boolean[])((boolean[])var0[8]))[7]) {
         if(~var5 != ~((int[])((int[])var4[1]))[10] && ((int[])((int[])var4[1]))[25] != var5 && ((int[])((int[])var4[1]))[23] != var5 && ((int[])((int[])var4[1]))[28] != var5) {
            if(((int[])((int[])var4[1]))[22] == var5 || ((int[])((int[])var4[1]))[11] == var5 || ~var5 == ~((int[])((int[])var4[1]))[9] || ~var5 == ~((int[])((int[])var4[1]))[37]) {
               var3 = ((int[])((int[])var2[1]))[8];
            }
         } else {
            var3 = ((int[])((int[])var2[1]))[10];
         }
      } else {
         var3 = ((int[])((int[])var2[1]))[20];
      }

      return var1 <= 111?-25:var3;
   }

   static final void b(byte var0, Object[] var1) {
      if(var0 <= -19) {
         if(null == var1[1]) {
            var1[1] = new int[2];
         }

         ++a;
         if(null == var1[3]) {
            var1[3] = new long[1];
         }

      }
   }

   static final boolean a(int var0, Object[] var1) {
      ++b;
      return var0 != 18845?true:((boolean[])((boolean[])var1[1]))[0];
   }

   static final void a(byte var0, Object[] var1) {
      ++e;
      if(null != var1 && var1.length == 5) {
         cg.c((Object[])null, (byte)127);
      }

      ((int[])((int[])var1[1]))[1] = 1;
      ((int[])((int[])var1[1]))[0] = 0;
      ((int[])((int[])var1[1]))[3] = 0;
      ((int[])((int[])var1[1]))[4] = 1;
      var1[3] = ura.a(-64, new Object[2]);
      ((boolean[])((boolean[])var1[0]))[3] = true;
      var1[4] = vk.f;
      ((boolean[])((boolean[])var1[0]))[0] = true;
      ((boolean[])((boolean[])var1[0]))[1] = true;
      if(var0 <= 49) {
         a((Object[])null, (Object[])null, (byte)0);
      }

      ((int[])((int[])var1[1]))[2] = 0;
      ((boolean[])((boolean[])var1[0]))[4] = true;
      ((boolean[])((boolean[])var1[0]))[2] = false;
      var1[2] = new Object[2][];
   }

   static final boolean a(boolean var0, String var1, Object[] var2) throws oqa {
      ++j;
      var2[17] = fk.a(var1, 5846, (Object[])((Object[])var2[0]));
      if(var2[17] == null) {
         throw new oqa("");
      } else {
         var2[20] = rka.a("textureMatrix", (Object[])((Object[])var2[17]), (byte)-122);
         var2[9] = rka.a("modelMatrix", (Object[])((Object[])var2[17]), (byte)-118);
         var2[4] = rka.a("viewMatrix", (Object[])((Object[])var2[17]), (byte)-118);
         var2[5] = rka.a("projectionMatrix", (Object[])((Object[])var2[17]), (byte)-121);
         var2[12] = rka.a("modelViewMatrix", (Object[])((Object[])var2[17]), (byte)-124);
         var2[10] = rka.a("modelViewProjectionMatrix", (Object[])((Object[])var2[17]), (byte)-120);
         var2[18] = rka.a("viewProjectionMatrix", (Object[])((Object[])var2[17]), (byte)-120);
         var2[16] = rka.a("ambientColour", (Object[])((Object[])var2[17]), (byte)-123);
         if(null != var2 && var2.length == 3 && var2[2].equals(Integer.valueOf(1)) && var2[2].equals(Integer.valueOf(0))) {
            return true;
         } else {
            var2[11] = rka.a("sunDirection", (Object[])((Object[])var2[17]), (byte)-119);
            var2[8] = rka.a("sunColour", (Object[])((Object[])var2[17]), (byte)-120);
            var2[14] = rka.a("antiSunColour", (Object[])((Object[])var2[17]), (byte)-118);
            var2[21] = rka.a("sunExponent", (Object[])((Object[])var2[17]), (byte)-124);
            var2[6] = rka.a("eyePosition", (Object[])((Object[])var2[17]), (byte)-125);
            var2[13] = rka.a("eyePositionOS", (Object[])((Object[])var2[17]), (byte)-126);
            var2[15] = rka.a("sunDirectionOS", (Object[])((Object[])var2[17]), (byte)-123);
            if(vpa.b(-20517, var2) == var0) {
               Object[] var4 = (Object[])((Object[])var2[17]);
               Object[] var3 = (Object[])(-1 >= ~((int[])((int[])var4[1]))[2]?((Object[])((Object[])var4[3]))[((int[])((int[])var4[1]))[2]]:null);
               if(null == var3) {
                  Object[] var5 = vqa.a((Object[])((Object[])var2[17]), (byte)52);
                  if(var5 == null) {
                     throw new oqa(ic.a((byte)98, (Object[])((Object[])var2[17])) + "");
                  }

                  an.a(var5, (Object[])((Object[])var2[17]), var0);
               }

               ((int[])((int[])var2[1]))[0] = qsa.a((byte)-9, (Object[])((Object[])var2[17]));
               var2[7] = new int[((int[])((int[])var2[1]))[0]];
               return true;
            } else {
               var2[4] = null;
               var2[17] = null;
               var2[5] = null;
               var2[12] = null;
               var2[20] = null;
               var2[9] = null;
               if(var2 != null && var2.length == 15 && var2[7].equals(Integer.valueOf(1)) && var2[7].equals(Integer.valueOf(0))) {
                  return ((boolean[])((boolean[])ni.v[12]))[2];
               } else {
                  var2[21] = null;
                  var2[8] = null;
                  var2[18] = null;
                  var2[6] = null;
                  var2[10] = null;
                  var2[16] = null;
                  var2[11] = null;
                  var2[14] = null;
                  var2[15] = null;
                  var2[13] = null;
                  return false;
               }
            }
         }
      }
   }

   static final Object[] a(Object[] var0, Object[] var1, byte var2) {
      aa.a(15022, var1, var0);
      ++f_i;
      if(var2 >= -8) {
         a((byte)-87, (Object[])null);
      }

      return var0;
   }

}
