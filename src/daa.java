
final class daa extends lm {

   static int k;
   Object[] n;
   static int f_l;
   static int o;
   static int m;
   static int j;


   static final Object[] a(int var0, Object[] var1) {
      ava.a((byte)-106, var1);
      ++j;
      hq.b(var1, -97);
      if(var0 != 24) {
         a((Object[])((Object[])var1[2]), -40, ((byte[])((byte[])var1[15]))[0]);
      }

      return var1;
   }

   static final boolean a(Object[] var0, byte var1) {
      if(var1 >= -11) {
         return false;
      } else {
         ++k;
         return false;
      }
   }

   daa(Object[] var1) {
      this.n = var1;
   }

   static final void a(String var0, byte var1) {
      rna.d = var0;
      ++f_l;
      if(ej.a(14193) != kl.f) {
         int var2 = 16 % ((-47 - var1) / 33);

         try {
            String var3 = kqa.h.getParameter((String)kfa.c[0]);
            String var4 = kqa.h.getParameter((String)go.f[0]);
            String var5 = var3 + "settings=" + var0 + "; version=1; path=/; domain=" + var4;
            if(var0.length() == 0) {
               var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
               var5 = var5 + "; Expires=" + Class_b.a(94608000000L + he.a(61), false) + "; Max-Age=" + 94608000L;
            }

            fu.a((byte)-56, "document.cookie=\"" + var5 + "\"", kqa.h);
         } catch (Throwable var6) {
            ;
         }

      }
   }

   static final int a(Object[] var0, int var1, byte var2) {
      ++o;
      if(!se.a((Object[])((Object[])var0[0]), (byte)-122)) {
         if(fca.a(125, (Object[])((Object[])var0[0])) != uha.g) {
            if(var2 > -118) {
               ((byte[])((byte[])var0[20]))[0] = 31;
            }

            return 3;
         } else {
            if(0 == var1) {
               if(Class_ss.b((Object[])((Object[])((Object[])((Object[])var0[0]))[38]), 0) == 1) {
                  return 2;
               }

               if(fpa.a((int)0, (Object[])((Object[])((Object[])((Object[])var0[0]))[24])) == 1) {
                  return 2;
               }

               if(pda.a(true, (Object[])((Object[])((Object[])((Object[])var0[0]))[25])) > 0) {
                  return 2;
               }
            }

            return 1;
         }
      } else {
         return 3;
      }
   }

}
