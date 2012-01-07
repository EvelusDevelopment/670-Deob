import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import java.awt.Canvas;
import java.io.IOException;

final class hpa {

   static int c = -1;
   static int a;
   static int d;
   static int b;


   static final gv a(Object[] var0, int var1, Canvas var2, int var3, int var4) {
      if(var4 > -92) {
         a((Object[])((Object[])var0[6]), -113, (Canvas)null, -42, ((int[])((int[])var0[1]))[14]);
      }

      ++d;
      Object[] var5;
      return (gv)((var5 = aa.a(var0, var2, 99, new Object[6])) == null?null:var5[0]);
   }

   static final void a(Object[] var0, int var1) throws IOException {
      if(var0 != null && -6 == ~var0.length) {
         era.a((Object[])null, (byte)-67);
      }

      ++b;
      int var3 = 52 % ((-25 - var1) / 61);
      if(!((boolean[])((boolean[])var0[7]))[2]) {
         for(; !((boolean[])((boolean[])var0[7]))[1]; ((boolean[])((boolean[])var0[7]))[0] = false) {
            Object[] var4;
            if(((boolean[])((boolean[])var0[7]))[0]) {
               Class_ls var2;
               var4 = (var2 = (Class_ls)pm.a((long)((OggPage)var0[1]).getSerialNumber(), (Object[])((Object[])var0[4]), false)) == null?null:var2.j;
            } else {
               var4 = ke.a((int)-14100, var0);
               if(var4 == null) {
                  if(((boolean[])((boolean[])var0[7]))[3]) {
                     era.a(var0, (byte)-67);
                  }

                  return;
               }

               if(var4 == null) {
                  throw new IllegalStateException();
               }

               ((boolean[])((boolean[])var0[7]))[0] = true;
            }

            if(var4 != var0[8]) {
               if(null != var4 && var4.length == 7) {
                  eba.a(var0, (byte)120);
               } else if(var4 != var0[3]) {
                  if(null != var0 && (-7 == ~var0.length || -9 == ~var0.length || 4 == var0.length && var0[0].equals(Integer.valueOf(1)) && var0[0].equals(Boolean.valueOf(false)))) {
                     return;
                  }

                  for(; ((OggStreamState)var4[2]).packetOut((OggPacket)var0[0]) == 1; qk.a(1, var4, (OggPacket)var0[0])) {
                     if(((int[])((int[])var4[1]))[0] == 1 && var4 != null && 7 == var4.length) {
                        wha.a((String)var0[5], 5, var0);
                     }
                  }
               } else if(var0[8] == null && !((boolean[])((boolean[])var0[7]))[2]) {
                  int var5 = 0;
                  if(null != var0 && 9 == var0.length && var0[7].equals(Integer.valueOf(2))) {
                     return;
                  }

                  while(10 > var5 && fka.a((int)-20000, var0)) {
                     Class_cs.a(var0, true);
                     if(((boolean[])((boolean[])var0[7]))[1]) {
                        return;
                     }

                     ++var5;
                  }

                  return;
               }
            } else {
               if(gk.a((Object[])((Object[])var0[8]), -16356) >= 50) {
                  return;
               }

               while(1 == ((OggStreamState)((Object[])((Object[])var0[8]))[2]).packetOut((OggPacket)var0[0])) {
                  qk.a(1, (Object[])((Object[])var0[8]), (OggPacket)var0[0]);
                  eba.a(var0, (byte)94);
                  if(var0[3] != null) {
                     double var9 = jj.a(3, (Object[])((Object[])var0[3]));
                     if(null != var0 && (6 == var0.length || 2 == var0.length)) {
                        return;
                     }

                     for(int var7 = 0; var7 < 10 && fka.a((int)-20000, var0); ++var7) {
                        Class_cs.a(var0, true);
                        if(((boolean[])((boolean[])var0[7]))[1]) {
                           return;
                        }
                     }

                     if(var9 < jj.a(3, (Object[])((Object[])var0[3]))) {
                        return;
                     }
                  }

                  if(50 <= gk.a((Object[])((Object[])var0[8]), -16356)) {
                     return;
                  }
               }
            }
         }

      }
   }

   static final Object[] a(Object[] var0, boolean var1) {
      if(var1) {
         a((Object[])null, 57, (Canvas)null, -50, ((int[])((int[])var0[7]))[10]);
      }

      ++a;
      mla.b((byte)-128, var0);
      return var0;
   }

}
