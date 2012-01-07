import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;

final class nk {

   static int a;
   static int e;
   static int b;
   static Object[] h;
   static int c;
   static int f;
   static int d;
   static int g;


   static final void a(int var0, int var1, int[] var2, Object[] var3, int var4, int var5, int var6, int var7) {
      ++c;
      if(var3 != null && var3.length == 15) {
         kk.a(var0, var3, var5, var4, (byte)-51, var1, var6, var2);
      } else {
         if(var7 != 15) {
            h = (Object[])null;
         }

         wh.a(var1, var3, var0, var5, var4, var6, 2, var2);
      }
   }

   static final void a(Object[] var0, boolean var1) {
      if(var1) {
         if(var0[1] == null) {
            var0[1] = new int[4];
         }

         ++a;
      }
   }

   static final void a(String[] var0, int var1) {
      if(var1 != 6) {
         h[7] = (Object)null;
      }

      ++e;
      if(-2 > ~var0.length) {
         for(int var2 = 0; var0.length > var2; ++var2) {
            if(var0[var2].startsWith("pause")) {
               int var3 = 5;

               try {
                  var3 = Integer.parseInt(var0[var2].substring(6));
               } catch (Exception var5) {
                  ;
               }

               qs.a((byte)-73, "Pausing for " + var3 + " seconds...");
               toa.g = var2 + 1;
               ki.f = var0;
               os.e = (long)(var3 * 1000) + he.a(53);
               return;
            }

            rt.f = var0[var2];
            nja.a((byte)38, false);
         }
      } else {
         rt.f = rt.f + var0[0];
         nr.e += var0[0].length();
      }

   }

   static final float b(int var0, Object[] var1) {
      ++b;
      return var0 != 1?1.7185217F:(((boolean[])((boolean[])var1[8]))[2] && !((SimplePeer)var1[12]).b()?(float)((TheoraInfo)var1[12]).fpsNumerator / (float)((TheoraInfo)var1[12]).fpsDenominator:0.0F);
   }

   static final void a(boolean var0, Object[] var1) {
      ++g;
      if(var0) {
         a((String[])null, -77);
      }

   }

   static final Object[] a(Object[] var0, OggStreamState var1, byte var2) {
      ++f;
      if(null == var0[1]) {
         var0[1] = new int[3];
      }

      if(null == var0[9]) {
         var0[9] = new long[1];
      }

      if(var0[8] == null) {
         var0[8] = new boolean[4];
      }

      if(var0[3] == null) {
         var0[3] = new double[1];
      }

      fsa.a(0, var0, var1);
      var0[6] = new SetupInfo();
      var0[12] = new TheoraInfo();
      int var3 = -76 % ((var2 - 68) / 58);
      var0[4] = new TheoraComment();
      return var0;
   }

   static final void a(int var0, Object[] var1) {
      if(var0 != 14945) {
         h = (Object[])null;
      }

      if(var1[1] == null) {
         var1[1] = new int[8];
      }

      ++d;
   }

}
